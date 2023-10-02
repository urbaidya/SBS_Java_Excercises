package com.exercises.sopra.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {
	char myChar;
	static ArrayList<String> arrayList =  new ArrayList<>(Arrays.asList(
			"Mal", "Wash", "Kaylee", "Inara", "Raman", "Raju", 
			"Zoë", "Jayne", "Simon", "River", "Shepherd Book"));
	public Excercise2() {
		System.out.println("\n----------------");
		System.out.println("-In Excercise 2-");
		System.out.println("----------------\n");
	}
	public char getMyChar() {
		return myChar;
	}
	public void setMyChar(char myChar) {
		this.myChar = myChar;
	}
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("List of names displayed below "+Excercise2.arrayList);
			System.out.print("Enter a char with which the names should start: ");
			setMyChar(sc.nextLine().toLowerCase().charAt(0));
		}
		finally {
			sc.close();
		}
	}
	public void printNamesStartingWith() {
		ArrayList<String> selectedName = new ArrayList<String>(); 
		for (String name:arrayList) {
			if (name.toLowerCase().charAt(0)==getMyChar()) {
				selectedName.add(name);
			}
		}
		if (selectedName.isEmpty()) {
			System.out.println("None");
		}
		else {
			for (String name: selectedName) {
				System.out.println(name);
			}
		}
	}
}
