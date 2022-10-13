package org.example.list;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Given the list of employees, You need to find highest age of employee?
 */
public class Exercise4 {
	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();
		OptionalInt iOptionalInt= employees.stream().mapToInt(Employee::getAge).max();
		System.out.println(iOptionalInt.getAsInt());

		// Or
		Optional<Employee> employee = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
		System.out.println(employee);
	}
}
