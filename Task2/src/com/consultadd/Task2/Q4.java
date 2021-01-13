package com.consultadd.Task2;
import java.util.Scanner;
/*
* 4. 	Write a program in JAVA to break and continue if the following cases occurs:

* If user enters a negative number just break the loop and print “It’s Over”
*If user enters a positive number just continue in the loop and print “Good Going”
*
* @author:Girija
*/
public class Q4 {
    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.breakContinue();
    }
    public void breakContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int count = 0, number = 0;
        //number = sc.nextInt();
        while (true) {
            if(sc.nextInt() >=0) {
                System.out.println("Good Going");
                continue;
            }
            System.out.println("It's Over");
            break;
        }
    }
}
