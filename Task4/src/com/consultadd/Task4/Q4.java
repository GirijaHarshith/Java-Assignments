package com.consultadd.Task4;
/*
 * 4. Write a Java program to add two matrices of the same size. . .
 *
 * @author Girija
 */
public class Q4 {
    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.addMatrices();
    }
    public void addMatrices(){
        int[][] a={{1,2,3},{4,5,6}};      //new int[2][3];
        int[][] b={{1,2,3},{4,5,6}};
        int row= a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] += b[i][j];
                System.out.print("Addition of two marices is " + a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
