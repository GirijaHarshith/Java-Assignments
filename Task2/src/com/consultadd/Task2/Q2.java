package com.consultadd.Task2;

import java.util.Scanner;

/*2. 	Write a program in JAVA to perform the following operator based task:
*
* Ask user to choose the following option first:
* If User Enter 1 - Addition
* If User Enter 2 - Subtraction
* If User Enter 3 - Division
* If User Enter 4 - Multiplication
* If User Enter 5 - Average
*
* Ask user to enter the 2 numbers in a variable for first and second(first and second are variable names) for the first 4 options mentioned above and print the result.
*
* Ask user to enter two more numbers as first1 and second2 for calculating the average as soon as user choose an option 5.
*
* At the end if the answer of any operation is Negative print a statement saying “Oops option X(1/2/3/4/5/) is returning the negative number”
*
* NOTE: At a time user can perform one action at a time.
*
* @author : Girija
*/
public class Q2 {
    public static void main(String[] args) {
        Q2 q2 =new Q2();
        q2.performOperation();
    }

    public void performOperation() {
        int option;
        int result=0,first=0,second=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-Addition, 2-Subtraction, 3-Division, 4-Multiplication, 5-Average");
        option=sc.nextInt();
        System.out.println("Enter 2 numbers");
        first = sc.nextInt();
        second = sc.nextInt();
        switch(option){
            case 1:
                result = first + second;
                break;
            case 2:
                result = first - second;
                break;
            case 3:
                result = first * second;
                break;
            case 4:
                result = first / second;
                break;
            case 5:
                System.out.println("Enter two more numbers");
                int first1 = sc.nextInt();
                int second2 = sc.nextInt();
                result = (first + second + first1 + second2) / 4;
                break;
            default:
                System.out.println("Please enter the correct option");
        }
        if(result>0)
            System.out.println("Result of option " + option + " operation is " + result);
        else if (result<0)
            System.out.println("Oops option x(1/2/3/4/5/) is returning the negative number");
    }
}
