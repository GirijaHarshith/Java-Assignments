package com.consultadd.Task2;

import java.util.Scanner;

/*
* 7.	Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
* Otherwise, print "positive" or "negative".
* Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
* @author:Girija
*/
public class Q7 {
    public static void main(String[] args) {
        Q7 q7 = new Q7();
        q7.posNeg();
    }
    public void posNeg(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter floating point number");
        float number = sc.nextFloat();
        if(number==0f)
            System.out.println("Zero");
        else if(number>0) {
            System.out.print("Positive");
            if (number > 1000000)
                System.out.println(" and large");
            else if (number < 1)
                System.out.println(" and small");
        } else if(number<0) {
            System.out.print("Negative");
            if (Math.abs(number) > 1000000)
                System.out.println(" and large");
            else if (Math.abs(number) < 1)
                System.out.println(" and small");
        }
    }
}


