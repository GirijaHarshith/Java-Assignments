package com.consultadd.Task7;
/*
* 5 .Program to Count the number of words in the String?
* @author Girija
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
    Q5 q5=new Q5();
    String str="I love Java";
    int size= q5.numOfWords(str);
    System.out.println("Number of words in a string: "+size);
}

    private int numOfWords(String s) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(s.split(" ")));
        return list.size();
    }
}
