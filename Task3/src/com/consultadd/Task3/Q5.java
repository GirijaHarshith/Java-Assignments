package com.consultadd.Task3;
/*
* 5 Write a JAVA program that takes long type input from user, and
*   Calculate and display the number of digits.
* Calculate the sum of all the digits of the input.
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.digits();
    }

    public void digits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter long digits");
        long digits=sc.nextLong();
        long rem=0;
        int length=0;
        while(digits>0){
            rem+=digits%10;             //rem=rem+digits%10;
            digits/=10;                 //digits=digits/10;
            length++;
        }
        System.out.println("Number of digits " + length);
        System.out.println("Sum of digits "+rem);

    }
}
