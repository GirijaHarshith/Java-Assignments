package com.consultadd.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 10. Write a Java program to display Pascal's triangle.
* Test Data
* Input number of rows: 5
* Expected Output :
* Input number of rows: 5
*      1
*     1 1
*    1 2 1
*   1 3 3 1
*  1 4 6 4 1
*
* @author Girija
*/

public class Q10 {
    public static void main(String[] args) {
        Q10 q10 = new Q10();
        q10.pascalTriangle();
    }

    public void pascalTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for(int s=0;s<rows-1;s++){
            System.out.print(" ");
        }
        System.out.println(prev.get(0));
        for(int i=1; i<rows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(0, 1);
            curr.add(curr.size()-1, 1);
            for(int j=1; j<i; j++) {
                curr.add(j, prev.get(j - 1) + prev.get(j));
            }

            for(int s=0;s<rows-1-i;s++){
                System.out.print(" ");
            }
            prev = new ArrayList<>(curr.size());
            for(int k=0; k<curr.size();k++){
                prev.add(k, curr.get(k));
                System.out.print(prev.get(k) + " ");
            }
            System.out.println();
        }
    }
}