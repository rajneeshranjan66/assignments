package com.te.javabasics.assignments;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner scs=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scs.nextInt();
		for (int i = 0; i<=n; i++) {
			for (int j = 0; j<=i ; j++) {
				System.out.print("x");	 
			}
			System.out.println();
		}
	}
	}


