package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String studentName;
	private int age;
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String student_name, int age, String city) {
		super();
		this.id = id;
		this.studentName = student_name;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", student_name=" + studentName + ", age=" + age + ", city=" + city + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
