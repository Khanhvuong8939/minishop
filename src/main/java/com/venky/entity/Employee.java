package com.venky.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Employee")
public class Employee {

	@Id
	private int idEmployee;
	private String name;
	private int age;

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
