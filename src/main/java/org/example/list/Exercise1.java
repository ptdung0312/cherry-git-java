package org.example.list;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of employees, you need to find all the employees whose age is greater than 30
 * and print the employee names.
 */
public class Exercise1 {
	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();
		List<String> empNames = employees.stream()
				.filter(employee -> employee.getAge() > 30)
				.map(employee -> employee.getName())
				.collect(Collectors.toList());
		empNames.forEach(System.out::println);
	}

	public void test1() {
		System.out.println("test 1");
	}

	public String getNAme() {
		return "a";
	}

	public String getAddress() {
		return "HCM";
	}
}
