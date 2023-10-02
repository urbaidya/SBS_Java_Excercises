package com.exercises.sopra;

import java.util.Scanner;

import com.exercises.sopra.list.Excercise1;
import com.exercises.sopra.list.Excercise2;
import com.exercises.sopra.list.Excercise3;

public class MyApplication {

	public static void main(String[] args) {
		System.out.print("<currently we have 6 excercises>"
				+ "\n<please enter any number from 1 to 6>\n");
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Which Excercise You Want to See ? ");
			int exNum = sc.nextInt();
			switch (exNum) {
			case 1:
				Excercise1 ex1 = new Excercise1();
				ex1.getInput();
				ex1.printVowelConstSplitted();
				break;
			case 2:
				Excercise2 ex2 = new Excercise2();
				ex2.getInput();
				ex2.printNamesStartingWith();
				break;
			case 3:
				Excercise3 ex3 = new Excercise3();
				ex3.getInputFromUser();
				ex3.sortNumericElements();
				break;
			default:
				System.out.println("No such case !! "
						+ "\n<please enter numbers from 1 to 6 only>");
				break;
			}
		}
		catch(Exception e) {
			System.out.println("Some exception occured: "+e);
		}
		finally {
			sc.close();
		}
	}

}
