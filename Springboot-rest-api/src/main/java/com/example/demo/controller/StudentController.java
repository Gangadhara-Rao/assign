package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Student;

@RestController
public class StudentController {
	
	@GetMapping("/s")
	public Student getStudent() {
		Student student= new Student(2,"Gangadhar","chandu");
		return student;
	}
	@GetMapping("/ss")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student(1,"siva","va"));
		students.add(new Student(2,"vamsi","b"));
		students.add(new Student(3,"sai","utukuri"));
		students.add(new Student(4,"vijay","sellam"));
		return students;
	}
	@GetMapping("s/{id}")
	public Student StudentPathVariable(@PathVariable int id) {
		return new Student(id,"chandu","ganga");
	}
	@GetMapping("s/{id}/{firstname}/{lastname}")
	public Student StudentPathVariable(@PathVariable("id") int studentId,
										@PathVariable("firstname") String firstname,
										@PathVariable("lastname") String lastname) {
		return new Student(studentId,firstname,lastname);
	}
	
	@GetMapping("s/query")
	public Student StudentRequestParm(@RequestParam int id,
										@RequestParam String firstname,
										@RequestParam String lastname) {
		return new Student(id,firstname,lastname);
	}
	@PostMapping("student/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getFistname());
		System.out.println(student.getLastname());
		return student;
	}
	@PutMapping("student/{id}/update")
	public Student updateStudent(@RequestBody Student student,@PathVariable("id") int studentId) {
		System.out.println(student.getFistname());
		System.out.println(student.getLastname());
		return student;

	}
	@DeleteMapping("student/{id}/delete")
	public String deleteStudent(@PathVariable("id")int studentId) {
		System.out.println(studentId);
		return "deleted successfully";
	}
}
