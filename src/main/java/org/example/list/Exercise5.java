package org.example.list;

import java.util.Comparator;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {
		List<Employee> employees = StreamGetListOfEmployees.getListOfEmployees();
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
	}
}
