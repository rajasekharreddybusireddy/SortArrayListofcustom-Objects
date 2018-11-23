package com.blogspot.javabyrajasekhar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomArrayListSorting {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1, "raju", 5000d));
		arrayList.add(new Employee(5, "srinu", 2000d));
		arrayList.add(new Employee(2, "abhi", 15000d));
		arrayList.add(new Employee(9, "balu", 32000d));
		arrayList.add(new Employee(6, "ramu", 200d));
		arrayList.add(new Employee(8, "vamsi", 700d));
		arrayList.add(new Employee(4, "danush", 8000d));

		for (Employee employee : arrayList) {
			System.out.println(employee.getEno() + " " + employee.getName() + " " + employee.getSalary());
		}
		System.out.println("based on name sorting----------------------");
		Collections.sort(arrayList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Employee employee : arrayList) {
			System.out.println(employee.getEno() + " " + employee.getName() + " " + employee.getSalary());
		}

		System.out.println("based on salary sorting----------------------");
		Collections.sort(arrayList, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
		for (Employee employee : arrayList) {
			System.out.println(employee.getEno() + " " + employee.getName() + " " + employee.getSalary());
		}

		System.out.println("based on eno sorting----------------------");
		Collections.sort(arrayList, (o1, o2) -> o1.getEno().compareTo(o2.getEno()));
		for (Employee employee : arrayList) {
			System.out.println(employee.getEno() + " " + employee.getName() + " " + employee.getSalary());
		}
	}

}
