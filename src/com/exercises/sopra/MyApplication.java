package com.exercises.sopra;

import java.util.Scanner;

import com.exercises.sopra.list.Excercise1;
import com.exercises.sopra.list.Excercise2;
import com.exercises.sopra.list.Excercise3;
import com.exercises.sopra.list.Excercise4;
import com.exercises.sopra.list.Excercise5;

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
			case 4:
				Excercise4 ex4 = new Excercise4();
				ex4.getInputFromUser();
				System.out.println("Does the string of number entered consists of ascending AND consecutive numbers? \nAnswer: " + String.valueOf(ex4.checkIfAscConsecutiveNum()));
				break;
			case 5:
				Excercise5 ex5 = new Excercise5();
				ex5.getInputFromUser();
				ex5.printArrayOfLen();
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
