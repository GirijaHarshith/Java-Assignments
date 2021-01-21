package com.consultadd.Task5;
/*
* 3 . Write a JAVA method to remove all the spaces from the String and return the resultant.
*
* @author Girija
*/
public class Q3 {
    public static void main(String[] args) {
        Q3 q3=new Q3();
        String str="     Welcome to Java Training  ";
        String resultStr=q3.removeSpaces(str);
        System.out.print("\nResultant String after removing spaces:"+resultStr);
    }

    private String removeSpaces(String str) {
        StringBuilder sb=new StringBuilder();
        //String resultStr=str.trim();     //to trim spaces before and after string;
        for(String word:str.split(" ")){
            sb.append(word);
        }
    return sb.toString();
    }
}
