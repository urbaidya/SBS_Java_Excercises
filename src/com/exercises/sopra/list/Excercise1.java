package com.exercises.sopra.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise1 {
	static char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	String myWord;
	ArrayList<String> arrayList;
	public Excercise1() {
		System.out.println("\n----------------");
		System.out.println("-In Excercise 1-");
		System.out.println("----------------\n");
		this.myWord="";
		this.arrayList= new ArrayList<>();
	}
	public String getMyWord() {
		return myWord;
	}
	public void setMyWord(String myWord) {
		this.myWord = myWord;
	}
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter a string: ");
			setMyWord(sc.nextLine());
		}
		finally {
			sc.close();
		}
	}
	public void printVowelConstSplitted() {
		String myStr="";
		String myWord=getMyWord();
		for(int i=0; i<myWord.length(); i++) {
			boolean foundVowel=false;
			for (char c: vowels) {
				if (c==myWord.charAt(i)) {
					foundVowel=true;
					if (myStr!="") {
						this.arrayList.add(myStr);
					}
					this.arrayList.add(String.valueOf(c));
					myStr="";
				}
			}
			if (!foundVowel) {
				myStr=myStr+myWord.charAt(i);
			}
		}
		if (myStr!="") {
			arrayList.add(myStr);
		}
		System.out.println("Below is the string splitted based on Vowels");
		for(String s:this.arrayList) {
			System.out.println(s);
		}
	}
}
