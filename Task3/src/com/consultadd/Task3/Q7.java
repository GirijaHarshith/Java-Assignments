package com.consultadd.Task3;
/*
*  7.Write a Java program to find the number of days in a month.
*    Test Data
*    Input a month number: 2
*    Input a year: 2016
*    Expected Output : February 2016 has 29 days
*
* @author Girija
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Q7 q7=new Q7();
        q7.daysInAMonth();
    }

    public void daysInAMonth() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input a month number(1-12)");
        int month=sc.nextInt();
        System.out.println("Input a year");
        int year=sc.nextInt();
        switch (month){
            case 1:
                System.out.println("January " + year + "has 31 Days");
                break;
            case 2:
                if(year%4==0)
                    System.out.println("February " + year + " has 29 days ");
                else
                    System.out.println("February " + year + " has 28 days ");
                break;
            case 3:
                System.out.println("March " + year + "has 31 Days");
                break;
            case 4:
                System.out.println("April " + year + "has 30 Days");
                break;
            case 5:
                System.out.println("May " + year + "has 31 Days");
                break;
            case 6:
                System.out.println("June " + year + "has 30 Days");
                break;
            case 7:
                System.out.println("July " + year + "has 31 Days");
                break;
            case 8:
                System.out.println("August " + year + "has 31 Days");
                break;
            case 9:
                System.out.println("September " + year + "has 30 Days");
                break;
            case 10:
                System.out.println("October " + year + "has 31 Days");
                break;
            case 11:
                System.out.println("November " + year + "has 30 Days");
                break;
            case 12:
                System.out.println("December " + year + "has 31 Days");
                break;
            default:
                System.out.println("Invalid Details");
                break;
        }
    }
}
