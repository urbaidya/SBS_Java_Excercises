package com.exercises.sopra.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise3 {
	private ArrayList<String> myList;
	private String orderType;
	
	public Excercise3() {
		System.out.println("\n----------------");
		System.out.println("-In Excercise 3-");
		System.out.println("----------------\n");
		this.myList= new ArrayList<>();
		this.orderType = "";
	}
	
	public void getInputFromUser(){
		String word="";
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("We have to create the list now. Its elements can be all number only. PLEASE DO NOT ENTER alphabets or any special characters");
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
			System.out.println("Each numeric element in the above list should be sorted in either Ascending or Descending");
			System.out.println("Please enter (A) for Ascending or (D) for Descending");
			word = sc.nextLine();
			this.orderType=word;
			System.out.println("The Order Type is: "+this.orderType);
		}
		finally {
			sc.close();
		}
	}
	
	public void sortNumericElements() {
		ArrayList<String> myNewList= new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("\nNumeric elements of Array when sort in ");
		if (this.orderType.equals("A")) {
			sb.append("Ascending Order ");
		}
		else {
			sb.append("Descending Order ");
		}
		sb.append("will be as below:");
		System.out.println(sb.toString());
		
		for (String ele: this.myList) {
			myNewList.add(sortTheNum(ele));
		}
		System.out.println(myNewList);
	}

	private String sortTheNum(String number) {
		StringBuilder sb = new StringBuilder();
		int[] numbers = new int[number.length()];
		for(int i=0;i<number.length();i++) {
			numbers[i]=Integer.parseInt(String.valueOf(number.charAt(i)));
		}
		Arrays.sort(numbers);
		for(int i:numbers) {
			sb.append(i);
		}
		if (this.orderType.equals("D")) {
			return sb.reverse().toString();
		}
		return sb.toString();
	}
}
