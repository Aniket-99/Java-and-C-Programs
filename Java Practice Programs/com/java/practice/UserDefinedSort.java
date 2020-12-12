package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	public String name;
	public Integer id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Student person) {

		return id.compareTo(person.id);
	}

}

public class UserDefinedSort {

	public static void main(String[] args) {
		List<Student> arr = new ArrayList<>();
		arr.add(new Student("Python", 1));
		arr.add(new Student("Java", 3));
		arr.add(new Student("Javascript", 2));
		arr.add(new Student("Csharp", 4));
		Collections.sort(arr);
		for (Student student : arr) {
			System.out.println(student.name + " " + student.id);
		}

	}

}
