package com.consultadd.Task3;
/*
*   2.Write a program in which:
*     Take 10 values input from user using loop.
*     Print sum of all the numbers provided
*     Print the Average of those 10 values
*
* @author Girija
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.sumAvg();
    }
    public void sumAvg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 values");
        int count = 0;
        double numbers = 0;
        while(count<10){
            numbers += sc.nextInt();
            count++;
        }
        System.out.print("Sum of all numbers provided " + numbers);
        System.out.println("\nAverage of those 10 values is "+ numbers/10);
    }

}
