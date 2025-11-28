package com.example.springmvcboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springmvcboot.Entity.Course;
import com.example.springmvcboot.repository.CourseRepository;

@Controller
public class CourseController {
	
	@Autowired
	private CourseRepository repo;
	
	@GetMapping("/showCourses")
	public String getAllCourses(Model m) {
		m.addAttribute("courses", repo.findAll());
		return "get-all-courses";
	}
	
	@GetMapping("/add")
	public String addCourse(Model m) {
		m.addAttribute("course", new Course());
		return "add-course";
	}
	
	@PostMapping("/save")
	public String saveCourse(Model m, @ModelAttribute("course") Course cou) {
		repo.save(cou);
		return "redirect:/showCourses";
	}
	
	@GetMapping("/edit/{id}")
	public String editCourse(Model m, @PathVariable int id) {
		Course cou = repo.findById(id).orElse(null);
		m.addAttribute("course", cou);
		return "edit-course";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteCourse(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/showCourses";
	}
}
