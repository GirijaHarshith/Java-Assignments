package com.consultadd.Task4;

import java.util.Arrays;

/*
 * 11. Write a Java program to sort an array of positive integers of a given array, in the sorted array the value of the first element should be maximum,
 * second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.
 *
 * @author Girija
 */
public class Q11 {
    public static void main(String[] args) {
        Q11 q11=new Q11();
        int[] arr={1,4,2,5,3,7,9};
        int[] result=q11.shuffle(arr);
    }

    private int[] shuffle(int[] arr) {
        Arrays.sort(arr);
        for (int element : arr)
            System.out.print(element);
        int low = 0;
        int high = arr.length-1;
        int i = 0;
        int[] res = new int[arr.length];

        while (low <= high) {
            res[i] = arr[high];
            i++;high--;
            if(low<=high)
                res[i++] = arr[low++];
            //i++; low++;            (or res[i++] = arr[low++];)
        }
        System.out.print("\nResult : ");
        for (int element : res)
            System.out.print(element);

        return res;
    }
}
