package com.consultadd.Task3;

import java.util.Scanner;

/*
* 8. Write a Java program that takes a year from user and print whether that year is a leap year or not.
*
* @author Girija
*/
public class Q8 {
    public static void main(String[] args) {
        Q8 q8 = new Q8();
        q8.leapYear();
    }

    public void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();
        if(year%4==0)
            System.out.println("It's a Leap year");
        else
            System.out.println("Not a leap year");
    }
}
