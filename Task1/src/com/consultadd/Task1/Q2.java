package com.consultadd.Task1;

import java.util.Scanner;

/*
* 2.Write a program to print the value given by the user.
*
* @author Girija
*/

public class Q2 {
    public Q2(){};
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.printValueByUser();
    }

    public void printValueByUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        System.out.println("Entered value is " + sc.next());
    }
}

