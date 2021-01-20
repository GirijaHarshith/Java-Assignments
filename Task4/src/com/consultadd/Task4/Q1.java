package com.consultadd.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * 1. Write a Java program to remove duplicate elements from an array.
 *
 * @author Girija
 */
public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.removeDuplicates();
    }
    public int[] removeDuplicates(){
        int[] arrElements = {1,2,1,2,3,8,3,5,5,8};
        int len = arrElements.length;
        if(len == 1) return arrElements;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arrElements);

        int j=0;
        list.add(arrElements[0]);
        for(int i=1;i<arrElements.length;i++){
            if(arrElements[i] != arrElements[j]){
                list.add(arrElements[i]);
            }
            j++;
        }

        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
            System.out.print(res[i]);
        }
        return res;
    }
}
