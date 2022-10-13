package org.example.list;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given the list of Employees, you need to join the all employee names with ","?
 */
public class Exercise6 {
	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();
		String empNames= employees.stream()
				.map(e -> e.getName())
				.collect(Collectors.joining(","));
		System.out.println("Employees are:" + empNames);

		String empName2 = employees.stream()
				.map(e -> e.getName())
				.collect(Collectors.joining(",", "[", "]"));
		System.out.println(empName2);
	}
	public void name() {
		System.out.println("print name");
	}
	public String check() {
		return "check";
	}
}
