package com.bridgelabz.day1programs;

public class SumofCommandLineArguments {


    public static void main( String args[] ) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        System.out.println("The sum is " + (a+b));
    }
}