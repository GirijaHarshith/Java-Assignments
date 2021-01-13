package com.consultadd.Task2;
import java.util.Scanner;
/*
*3. 	Write a program in JAVA to implement the given flowchart:
*
* @author: Girija
*/

public class Q3 {
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        q3.flowchart();
    }
    public void flowchart(){
        int a=10, b=20,c=30;
        double avg = ( a + b + c)/3;
        System.out.println("Average is " + avg);
        if(avg>a && avg>b && avg>c)
            System.out.println("Average is higher than a,b,c");
        else {
            if(avg>a && avg>b)
                System.out.println("Average is higher than a,b");
            else if(avg>a && avg>c)
                System.out.println("Average is higher than a,c");
            else if(avg>b && avg>c)
                System.out.println("Average is higher than b,c");
            else {
                if(avg>a)
                    System.out.println("Average is just higher than a");
                else if(avg>b)
                    System.out.println("Average is just higher than b");
                else if(avg>c)
                    System.out.println("Average is just higher than c");
            }

        }

    }
}
