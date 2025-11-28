Course Management System

A full-stack Spring Boot + Thymeleaf + MySQL CRUD application designed to manage course information, including adding, viewing, updating, and deleting course records.
This project demonstrates strong understanding of backend development, MVC architecture, data persistence, and dynamic UI rendering.

🚀 Features

➕ Add new course

📄 View list of all courses

✏️ Edit existing course details

❌ Delete course

🔄 Auto-updates list after every operation

🧩 Fully implemented Controller → Service → Repository architecture


🛠 Tech Stack

Backend:

Java

Spring Boot

Spring MVC

Spring Data JPA

Hibernate

Frontend:

Thymeleaf

HTML

CSS (optional)

Database:

MySQL

Build Tool:

Maven


🏗 Architecture

The project follows a layered structure:

Controller → Service → Repository → Entity → Database


This ensures:

Clean separation of concerns

Reusability and maintainability

Easy future expansion


Project Structure
src
 ├── main
 │    ├── java
 │    │    └── com.example.springmvcboot
 │    │         ├── controller
 │    │         ├── service
 │    │         ├── repository
 │    │         └── entity
 │    └── resources
 │         ├── templates (Thymeleaf pages)
 │         └── application.properties


How to Run

Clone the repository:

git clone https://github.com/Thapaswini09/course-management-system.git


Open in Spring Tool Suite (STS) or IntelliJ IDEA

Configure MySQL in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/coursedb
spring.datasource.username=root
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update


Run the project as Spring Boot App

Open browser:

http://localhost:8080/showCourses


🎯 Learning Outcomes

Implemented CRUD operations using Spring Data JPA

Built HTML forms with Thymeleaf + ModelAttribute

Used MVC architecture with proper separation of concerns

Performed database operations with MySQL

Worked with Git & GitHub for version control


👨‍💻 Author

Thapaswini Vanukuri
Passionate about Java development, Spring Boot, and full-stack projects.
