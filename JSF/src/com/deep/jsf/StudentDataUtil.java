package com.deep.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

	private List<Student> students;

	public StudentDataUtil() {
		loadSampleData();
	}

	public void loadSampleData() {
		students = new ArrayList<>();

		students.add(new Student("deep", "patil", "deepak@gmail.com"));
		students.add(new Student("priti", "patil", "priti@gmail.com"));
		students.add(new Student("durga", "patil", "durga@gmail.com"));
	}

	public List<Student> getStudents() {
		return students;
	}
}
