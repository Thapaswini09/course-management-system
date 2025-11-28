package com.example.springmvcboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvcboot.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
