package com.bridgelabz.day1programs;

import java.util.Scanner;

public class LeapYear {
    public static void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println( " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println( " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println( " is a leap year.");
        } else {
            System.out.println( " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scan.nextInt();
        checkLeapYear(year);

    }
}
