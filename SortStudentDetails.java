package com.te.javabasics.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudentDetails {
	static ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();

	public static void sortByChoice() {
		Scanner scn = new Scanner(System.in);
		System.out.print("-------------Sort By Choice------------- \nSort By Id - 1\nSort By Name - 2\n"
				+ "Sort By Age - 3\nSort By Marks - 4\nSelect Sorting Type: ");
		
		switch (scn.nextInt()) {
			case 1:
				Collections.sort(al, new SortId());
				break;
			case 2:
				Collections.sort(al, new SortName());
				break;
			case 3:
				Collections.sort(al, new SortAge());
				break;
			case 4:
				Collections.sort(al, new SortMarks());
				break;
			default:
				break;
		}

		for (StudentDetails sd : al) {
			System.out.println(sd);
		}
		
		System.out.print("Wanna Continue Sorting?(y/n): ");
		String y = "y";
		if(scn.next().equals(y)) {
			sortByChoice();
		}else {
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		al.add(new StudentDetails(101, "abhcb", 26, 69));
		al.add(new StudentDetails(104, "bsch", 54, 84));
		al.add(new StudentDetails(102, "ncbsc", 45, 23));
		al.add(new StudentDetails(103, "hvhsav", 83, 45));

		System.out.println(al);
		System.out.println("=============================");
		System.out.println("-------------Using foreach(B4-Sorting)-------------");
		for (StudentDetails sd : al) {
			System.out.println(sd);
		}
		sortByChoice();
	}
}