package com.consultadd.Task3;

import java.util.Scanner;

/*
* 9.Write a program in Java to display the pattern like right angle triangle with a number.
* Test Data
* Input number of rows : 10
* Expected Output :
* 1
* 12
* 123
* 1234
* 12345
* 123456
* 1234567
* 12345678
* 123456789
* 12345678910
*
* @author Girija
*/
public class Q9 {
    public static void main(String[] args) {
        Q9 q9 = new Q9();
        q9.trianglePattern();
    }

    public void trianglePattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
