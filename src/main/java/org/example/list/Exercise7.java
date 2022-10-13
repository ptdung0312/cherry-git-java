package org.example.list;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given the list of employees, you need to group them by name
 */
public class Exercise7 {
	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();

		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.toList()));
		System.out.println(map);
	}
}
