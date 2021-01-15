package com.consultadd.Task3;

import java.util.Scanner;

/*
* 1. Write a simple program to print multiplication table of a certain number taken from user,
*    For eg. 2 X 1 = 2
*            2 X 2 = 4
*            and so on.
* @author Girija
*/
public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.multiplication();
    }
    public void multiplication(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int result = 0;
        for(int i=1;i<=10;i++){
            result= number*i;
           System.out.println(number + "*" + i + "=" + result);
        }
    }
}
