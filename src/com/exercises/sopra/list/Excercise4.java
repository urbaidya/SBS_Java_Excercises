package com.exercises.sopra.list;

import java.util.Scanner;

public class Excercise4 {
	private String myNumber;
	
	public Excercise4() {
		System.out.println("\n----------------");
		System.out.println("-In Excercise 4-");
		System.out.println("----------------\n");
		this.myNumber = "";
	}
	
	public void getInputFromUser(){
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a String which is all numbers (eg. 127327, 234842, 3247)");
			System.out.println("DO NOT ENTER alphabets or special characters.");
			this.myNumber = sc.nextLine();
		}
		finally {
			sc.close();
		}
	}
	
	public boolean checkIfAscConsecutiveNum() {
		for (int i=1;i<this.myNumber.length();i++) {
			int a = myNumber.charAt(i-1) -0;
			int b = myNumber.charAt(i) -0;
			if (!(b>a && a+1==b)) {
				return false;
			}
		}
		return true;
	}
}
