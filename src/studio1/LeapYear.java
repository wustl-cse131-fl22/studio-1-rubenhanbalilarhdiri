package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	// TODO Auto-generated method stub
	System.out.print("Is it a leap year?");
	int y1 = in.nextInt();
	
	boolean leapYear = ((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0);
	System.out.println(y1 + " is a leap year:" + leapYear);

	}

}
