package com.consultadd.Task4;

import java.util.ArrayList;
import java.util.List;

/*
 * 9. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
 * Sample array: [1,2,4,5,6]
 * Target value: 6.
 *
 * @author Girija
 */
public class Q9 {
    public static void main(String[] args) {
        Q9 q9 = new Q9();
        int[] arr={1,2,4,6,5};
        int target=6;
        List<List> result = new ArrayList<>();
        result=q9.targetSum(arr, target);
        System.out.println(result);
    }

    private List<List> targetSum(int[] arr, int target) {
        List<List> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) {
                    List<Integer> temp = new ArrayList();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    list.add(temp);
                }
            }
        }
       return list;
    }
}

//    private void targetSum(int[] arr, int target) {
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target) {
//                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        }
//    }
//}


