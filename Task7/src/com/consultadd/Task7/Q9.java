package com.consultadd.Task7;

import java.util.Arrays;

/*
 * 9. Find the maximum value in Array without using Collection?
 * @author Girija
 */
public class Q9 {
    public static void main(String[] args) {
        Q9 q9=new Q9();
        int[] arr={1,3,6,8,9,-4,89};
        int max=q9.maxValue(arr);
        System.out.println("Maximum value in an array: "+max);
    }

    private int maxValue(int[] arr) {
        int max_value=Integer.MIN_VALUE;
        for(int i:arr){
            max_value=Math.max(max_value,i);
        }
        return max_value;
    }
}
