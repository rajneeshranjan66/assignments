package com.te.javabasics.assignments;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scs=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scs.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int j = i; j>=1 ; j--) {
				System.out.print(j+"");
				
			}
			System.out.println();
		}
	}
	}

