package org.example.list;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given the list of employees, find the count of employees with age greater than 25?
 */
public class Exercise2 {
	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();
		long countOfEmployee = employees.stream()
				.filter(e -> e.getAge() > 25).count();
		System.out.println(countOfEmployee);
	}
}
