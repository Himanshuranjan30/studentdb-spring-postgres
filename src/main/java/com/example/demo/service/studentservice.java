package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.studentrepository;
import com.example.demo.student.student;

@Service
public class studentservice {
	@Autowired
	public studentservice(studentrepository sturepo) {
		super();
		this.sturepo = sturepo;
	}

	private final studentrepository sturepo;

	public String welcome() {
		return "Hello Spring server";
	}

	public List<student> getstudents() {
		return this.sturepo.findAll();
	}

	public void insertstudent(student s) {
		this.sturepo.save(s);
	}

	public student getastudent(Long id) {
		return this.sturepo.getOne(id);
	}
	
	public void deleteastudent(Long id)
	{
		this.sturepo.deleteById(id);
	}
	public student updatestudent(student s)
	{
		this.sturepo.save(s);
		return s;
	}
}
