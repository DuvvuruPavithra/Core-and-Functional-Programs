package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Entered Number is even");
		}
		else {
			System.out.println("Entered Number is odd");

		}


	}

}
