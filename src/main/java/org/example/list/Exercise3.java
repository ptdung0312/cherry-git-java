package org.example.list;

import java.util.List;
import java.util.Optional;

/**
 * Given the list of employees, find any the employee whose name is John.
 */
public class Exercise3 {
	private String name;

	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();
		Optional<Employee> employee = employees.stream().filter(e -> "John".equalsIgnoreCase(e.getName())).findAny();
		employee.ifPresent(System.out::println);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
