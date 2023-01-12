package com.bridgelabz.day1programs;

import java.util.Scanner;

public class TwoStringEqualOrNot {
    public static void main(String[] args) {
        String s1, s2;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter First string");
        s1=  scan.nextLine();
        System.out.println("Enter Second string");
        s2= scan.nextLine();
        if (s1.equals(s2)) {
            System.out.println("String is Equal");
        }else
            System.out.println("String is unEqual");
    }
}
