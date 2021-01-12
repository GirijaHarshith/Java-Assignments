package com.consultadd.Task1;

/*
*Q1. Swap two numbers using third variable as result name and do the same task without using any third variable.
*
*@author Girija
 */

public class Q1 {
    public static void main(String[] args) {
        Q1 swap = new Q1();
        swap.swapUsingTemp();
        swap.swapWithoutUsingTemp();
    }

    //Swap two numbers using third variable
    public void swapUsingTemp(){
        int i=3, j=5, temp;
        System.out.println("Before Swapping i = " + i + " j = " + j);
        temp=i;
        i=j;
        j=temp;
        System.out.println("After Swapping i = " + i + " j = " + j);
    }

    //Swap two numbers without using third variable

    public void swapWithoutUsingTemp(){
        int i=3, j=5;
        System.out.println("Before Swapping i = " + i + " j = " + j);
        i=i+j; //i=8;
        j=i-j; //j=3
        i=i-j;
        System.out.println("After Swapping i = " + i + " j = " + j);
    }
}
