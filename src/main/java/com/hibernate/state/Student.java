package com.hibernate.state;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String course;
	private String clgName;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String course, String clgName) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.clgName = clgName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

}
