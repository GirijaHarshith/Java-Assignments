package com.consultadd.Task5;
/*
* 1.Write a JAVA program that takes given String of words and return the length of the shortest word.
*
* @author Girija
*/

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        String str="My name is Girija";
        int res=0;
        res=q1.lengthOfTheString(str);
        System.out.println("Length of shortest word : "+res);
    }

    private int lengthOfTheString(String str) {
        int minLength=Integer.MAX_VALUE;
        String shortWord="";
        for(String word:str.split(" ")) {
             //minLength=Math.min(minLength,word.length());
            if(word.length()<=minLength){
                minLength=word.length();
                shortWord=word;
            }
        }
        System.out.println("Shortest word : "+shortWord);
        return minLength;
    }
}
