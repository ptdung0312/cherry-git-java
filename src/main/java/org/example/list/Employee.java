package org.example.list;

import java.util.List;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private List<String> listOfCities;
	private String test;

	public Employee(String name, int age, List<String> listOfCities) {
		this.name = name;
		this.age = age;
		this.listOfCities = listOfCities;
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

	public List<String> getListOfCities() {
		return listOfCities;
	}

	public void setListOfCities(List<String> listOfCities) {
		this.listOfCities = listOfCities;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}
}