package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.studentservice;
import com.example.demo.student.student;

@RestController
@RequestMapping(path = "/api/student")
public class controllers {

	private final studentservice stuservice;

	@Autowired
	public controllers(studentservice stuservice) {
		super();
		this.stuservice = stuservice;
	}

	@GetMapping
	public String welcome() {
		return this.stuservice.welcome();
	}

	@GetMapping("/students")
	public List<student> getstudents() {
		return this.stuservice.getstudents();
	}

	@PostMapping("/students")
	public String poststudent(@RequestBody student stu) {
		System.out.println(stu);
		this.stuservice.insertstudent(stu);
		return "successfully added";
	}
	
	@GetMapping("/students/{id}")
	public student getastudent(@PathVariable String id)
	{
		return this.stuservice.getastudent(Long.parseLong(id));
	}
	@DeleteMapping("/students/{id}")
	public String deleteastudent(@PathVariable String id)
	{
		this.stuservice.deleteastudent(Long.parseLong(id));
		return "successfully deleted";
	}
	@PutMapping("/students")
	public student update(@RequestBody student s)
	{
		return this.stuservice.updatestudent(s);
	}
}
