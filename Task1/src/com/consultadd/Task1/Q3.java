package com.consultadd.Task1;
import java.util.Scanner;
/*
* 3. Write a program to complete the task given below:
*
*  Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.
*  Use z for adding 30 into it and print the final result by using variable results.
*
* @author Girija
*
*/
public class Q3 {
    public static void main(String[] args) {
       Q3 q3 = new Q3();
       q3.add();
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        int z=0;
        System.out.println("Enter 2 numbers between 1-10");
        for(int i=0; i<2; i++){
          z+=sc.nextInt();
        }
        z+=30;
        System.out.println("Sum of user input " + z);
    }
}
