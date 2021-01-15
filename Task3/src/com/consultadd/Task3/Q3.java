package com.consultadd.Task3;
/*
*  3 . Write a JAVA program that takes user input from 1 to 12 for months,
*      and display number of days of a particular month.
*      (Shows “Invalid Details“ if incorrect month number will be provided).
*
* @author Girija
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        q3.monthDays();
    }
    public void monthDays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 12 for months");
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("January = 31 Days");
                break;
            case 2:
                System.out.println("February = if leap year 29 days ,otherwise 28 days");
                break;
            case 3:
                System.out.println("March = 31 Days");
                break;
            case 4:
                System.out.println("April = 30 Days");
                break;
            case 5:
                System.out.println("May = 31 Days");
                break;
            case 6:
                System.out.println("June = 30 Days");
                break;
            case 7:
                System.out.println("July = 31 Days");
                break;
            case 8:
                System.out.println("August = 31 Days");
                break;
            case 9:
                System.out.println("September = 30 Days");
                break;
            case 10:
                System.out.println("October = 31 Days");
                break;
            case 11:
                System.out.println("November = 30 Days");
                break;
            case 12:
                System.out.println("December = 31 Days");
                break;
            default:
                System.out.println("Invalid Details");
                break;
        }
    }
}

