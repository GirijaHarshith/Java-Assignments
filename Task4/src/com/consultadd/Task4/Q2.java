package com.consultadd.Task4;

import java.util.Arrays;

/*
* 2. Write a Java program to find the second largest element in an array.
*
* @author Girija
*/
public class Q2 {
    public static void main(String[] args) {
     Q2 q2 = new Q2();
     q2.secondLargest();
    }
    public void secondLargest(){
        int[] array = {0,1,3,3,2,4,6,7};
        if(array.length==1) {
            System.out.println(array[0]);
            return;
        }
        Arrays.sort(array);                  //elements are sorted ={1,1,2,3,3,4,6,7}
        int j=0;
        int len=array.length;
         int[] res = new int[len];
         res[0]=array[0];
         int k=1;
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[j]) {
                //System.out.print(array[i]);
                res[k]=array[i];
                k++;
            }
            j++;
        }

        for(int i=0;i<array.length;i++)
            System.out.print(res[i]);

        System.out.println("\nSecond largest element is " + res[k-2]);
    }
}
