package com.example.demo.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class student {

	public student(String name, String email) {
		super();
		this.name = name;
		this.email = email;

	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age 
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public student(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return 18;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Id
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1

	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	private Long id;
	private String name;
	private String email;
	private Integer age;

}
