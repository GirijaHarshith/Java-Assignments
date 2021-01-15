package com.consultadd.Task3;
/*
*  11.Write a Java program that accepts two floating­ point numbers and
* checks whether they are the same up to two decimal places.
*
* @author Girija
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Q11 q11 = new Q11();
        q11.floatingPointNumbers();
    }

    public void floatingPointNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 floating point numbers");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        sc.close();
        if(Math.abs(f1-f2)<0.01f)
            System.out.println("Numbers are same");
        else
            System.out.println("Numbers are different");
    }
}
