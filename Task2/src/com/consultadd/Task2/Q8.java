package com.consultadd.Task2;

import java.util.Scanner;

/*8.	Write a JAVA program which takes character input from the user,
*
*      If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND.
*      Print NOT FOUND for all the other alphabets.
*
* @author:Girija
*/
public class Q8 {
    public static void main(String[] args) {
        Q8 q8=new Q8();
        q8.searchChar();
    }
    public void searchChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        String str = sc.next();
        if (str.length() != 1)
            System.out.println("Enter a character");
        else {
            char ch = str.toLowerCase().charAt(0);
            if (ch == 'r' || ch == 'a' || ch == 'n' || ch == 'd' || ch == 'o' || ch == 'm')
                System.out.println("FOUND");
            else
                System.out.println("NOT FOUND");
        }
    }

}
