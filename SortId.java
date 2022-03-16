package com.te.javabasics.assignments;

import java.util.Comparator;

public class SortId implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.student_id-o2.student_id;
	}
}