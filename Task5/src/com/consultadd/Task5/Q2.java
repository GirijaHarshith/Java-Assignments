package com.consultadd.Task5;

import java.util.Arrays;

/*
* 2. Write a JAVA program that gives sum of all the values of array except the highest and lowest values.
* (Assumption input doesnt have duplicates)
* @author Girija
*/
public class Q2 {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[] arr={1,2,4,3};//{2,3,1,4,5,8,6,7,9,0};
        int sum=q2.sumOfValues(arr);
        System.out.println("Sum of all values except highest and lowest values : "+sum);
    }

    private int sumOfValues(int[] arr) {
        int sum=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
