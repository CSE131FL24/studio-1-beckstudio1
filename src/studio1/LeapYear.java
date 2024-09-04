package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        String result = year + " is a leap year: " + isLeapYear;
        
        System.out.println(result);

	}

}
