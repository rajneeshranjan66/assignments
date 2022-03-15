package com.te.javabasics.assignments;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scs=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scs.nextInt();
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n-i ; j++) {
				System.out.print("");
			}
			for (int j = 1; j<=2*i-1; j++) {
				
			
				System.out.print((char)(j+64)+"");
				
			}
			System.out.println();
}}}
