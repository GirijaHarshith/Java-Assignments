package com.consultadd.Task2;
/*
*5.	 Write a program that prints all the numbers from 0 to 6 except 3 and 6.
*    Expected output: 0 1 2 4 5
*  @author: Girija
*/

public class Q5 {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.print();
    }
    public void print(){
        for(int i=0;i<6;i++){
            if(i==3){
                continue;
            }
            System.out.print(i + " ");

        }
    }
}

