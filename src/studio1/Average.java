package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the first integer to be averaged: ");
    int n1 = scan.nextInt();
    System.out.print("Enter the second integer to be averaged: ");
    int n2 = scan.nextInt();
    double average = (n1 + n2) / 2;
    System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
	}

}
