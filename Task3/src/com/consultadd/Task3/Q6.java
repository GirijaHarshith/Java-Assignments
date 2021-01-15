package com.consultadd.Task3;
/*
* 6. Write a program that accepts three numbers from the user and
* prints "INCREASING" if the numbers are in increasing order, "DECREASING" if the numbers are in decreasing order,
* and "Neither increasing or decreasing order" otherwise.
* FOR eg.
* Input first number: 1524
* Input second number: 2345
* Input third number: 3321
* Output : INCREASING
*
* @author Girija
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Q6 q6=new Q6();
        q6.sequence();
    }

    public void sequence() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if(number1>number2 && number2>number3)
            System.out.println("DECREASING");
        else if(number1<number2 && number2<number3)
            System.out.println("INCREASING");
        else
            System.out.println("Neither increasing or decreasing order");
    }
}
