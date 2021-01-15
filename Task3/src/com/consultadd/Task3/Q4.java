package com.consultadd.Task3;

import java.util.Scanner;

/*
* 4. Write a JAVA program that takes one integer input n from the user,
*    and display all the no, print sum of n natural numbers.
* @author Girija
*/
public class Q4 {
    public static void main(String[] args) {
        Q4 q4 =new Q4();
        q4.naturalNumbers();
    }

    public void naturalNumbers() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter one integer");
        int num = sc.nextInt();
        int sum=0;
        System.out.print("Natural numbers till "+ num + " is " );
        for(int i=0;i<num;i++){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nSum of natural numbers from " + sum);
    }
}
