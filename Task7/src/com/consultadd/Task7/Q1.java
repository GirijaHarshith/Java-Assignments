package com.consultadd.Task7;
/*
* 1. Program to reverse a string in java
*
* @author Girija
*/
public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        String str="Java plm";
        String rev=q1.reverseString(str);
        System.out.println(rev);
    }

    private String reverseString(String s) {
        StringBuilder sb=new StringBuilder(s);
        //sb.reverse();
        return sb.reverse().toString();
    }
}
