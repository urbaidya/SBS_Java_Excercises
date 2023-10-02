package com.exercises.sopra.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise5 {
	private ArrayList<String> myList;
	
	public Excercise5() {
		System.out.println("\n----------------");
		System.out.println("-In Excercise 5-");
		System.out.println("----------------\n");
		this.myList= new ArrayList<>();
	}
	
	public void getInputFromUser(){
		String word="";
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("We have to create the list now. Its elements names of people.");
			System.out.println("Please enter list elements, when you want to stop enter 'exit'");
			while(true) {
				word = sc.nextLine();
				if (word.toLowerCase().equals("exit")) {
					break;
				}
				this.myList.add(word);
			}
			System.out.println("The Array List is: "+this.myList);
			System.out.println();
		}
		finally {
			sc.close();
		}
	}
	
	public void printArrayOfLen() {
		System.out.println("Names and their length are as below:");
		for (String name: myList) {
			StringBuilder sb = new StringBuilder();
			sb.append("Name = ").append(name).append(" ,Length = ").append(name.length());
			System.out.println(sb.toString());
		}
	}
}
