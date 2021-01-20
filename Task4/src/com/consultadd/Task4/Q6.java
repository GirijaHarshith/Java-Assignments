package com.consultadd.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 6. Write a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.
* input: [2,2,3,3,4,4,4,11,11,11,11]
* output:[2,3,4,11,0,0,0,0,0,0,0]
*
* @author Girija
*/
public class Q6 {
    public static void main(String[] args) {
        Q6 q6 = new Q6();
        q6.removeDuplicatesAndAddZero();
    }
    public void removeDuplicatesAndAddZero(){
        int[] arrElements = {1,2,1,2,3,8,3,5,5,8};
        int len = arrElements.length;
        if(len == 1) return;
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

        int[] res = new int[len];
        for(int i=0;i<len;i++){
            if(i<list.size())
                res[i]=list.get(i);
            System.out.print(res[i]);
        }
    }
}

//     Another approach without using Arraylist
//    private void removeDuplicatesAndAddZero() {
//        int[] arr1= {2,2,3,3,4,4,4,11,11,11,11};
////        List<Integer> list=new ArrayList<>();
//        int[] arr2= new int[arr1.length];
//        int len=arr1.length;
//        int j=0;
//        arr2[0]=arr1[0];
//        int k=1;
//        for(int i=1;i<len-1;i++){
//            if(arr1[i]!=arr1[j]) {
//                arr2[k++] = arr1[i];
//            }
//            j++;
//        }
//
//        int[] res=new int[arr1.length];
//        for(int m=0;m<arr1.length;m++){
//            System.out.print(arr2[m]+" ");
//        }
//    }
//}
