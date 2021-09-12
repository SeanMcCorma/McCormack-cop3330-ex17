package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */

/* PLEASE NOTE
The equation provided is not correct. It should be (A*5.14)/(W*r)-(0.015*H).
This is the equation I used for this problem. I did not use, A * (5.14/W)*r-(0.015*H)
Which is what was used in the example outputs. This changes values.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = scan.nextInt();
        System.out.printf("How many ounces of alcohol did you have? ");
        int ounces = scan.nextInt();
        System.out.printf("What is your weight, in pounds? ");
        int weight = scan.nextInt();
        System.out.printf("How many hours has it been since your last drink? ");
        int hours = scan.nextInt();
        double ratio;
        if(gender ==1){
            ratio = 0.73;
        }else{
            ratio = 0.66;
        }
        float BAC = (float) ((((double)ounces)*5.14/(((double) weight)*ratio))-0.015*((double) hours));
        System.out.println("\nYour BAC is "+BAC);
        if(BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
