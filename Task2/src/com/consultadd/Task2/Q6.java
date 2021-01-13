package com.consultadd.Task2;
/*6.	Given an integer , perform the following conditional actions:
*        If  is odd, print NEW
*        If  is even and in the inclusive range of 2 to 5 , print OLD
*        If  is even and in the inclusive range of 6 to 30, print NEW
*        If  is even and greater than 30, print OLD
*       Complete the stub code provided in your editor to print whether or not is weird.
*
* @author:Girija
*/

import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Q6 q6 =new Q6();
        q6.newOld();
    }
    public void newOld(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int integer = sc.nextInt();
        //System.out.println(integer);
        if((integer%2)!=0)
            System.out.println("NEW");
        else if(integer%2==0 && (integer>=2 && integer<=5) )
            System.out.println("OLD");
        else if(integer%2==0 && (integer>=6 && integer<=30) )
            System.out.println("NEW");
        else if(((integer % 2) == 0) && (integer > 30))
            System.out.println("OLD");
        else
            System.out.println("Not in the Range");
    }
}
