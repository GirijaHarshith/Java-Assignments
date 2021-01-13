package com.consultadd.Task2;
import java.util.Scanner;
/*
*1.	Write a program in JAVA to print a number is divisible by 3 it should print “Consultadd” as a string
*
*   perform the following operation:
*   If a number is divisible by 5 it should print “JAVA Training” as a string
*   If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.
*
* @author: Girija S
*/

public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.divByNumber();
    }
    public void divByNumber() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();
        if (((num % 3) == 0) && ((num % 5) == 0)){
            System.out.println("Consultadd Java Training");
        } else if (num % 5 == 0) {
            System.out.println("Java Training");
        } else if (num % 3 == 0)  {
            System.out.println("Consultadd ");
        } else {
            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}
