package com.consultadd.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 8. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
 *
 * @author Girija
 */
public class Q8 {
    public static void main(String[] args) {
        Q8 q8=new Q8();
        q8.removeDuplicates();
    }

    private void removeDuplicates() {
        int[] arr={1,2,3,1,2,5,6,7,0,9};
        int len=arr.length;
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int j=0;
        list.add(arr[0]);
        for(int i=1;i<len;i++){
            if(arr[i]!=arr[j]){
                list.add(arr[i]);
            }
            j++;
        }

        for(int listElement:list){
            System.out.print(listElement+" ");
        }

        System.out.println("\nNew length of Array:"+list.size());
    }
}
