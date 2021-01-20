package com.consultadd.Task4;
import java.util.*;

/*
 * 5. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
 *
 * @author Girija
 */
public class Q5 {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.moveZeros();
    }
    public void moveZeros(){
        int[] arr={0,1,2,3,4,0,9,8,7,0,7,0,6};
        int[] res=new int[arr.length];
        int j=0;int len=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                res[j] = arr[i];
                j++;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(res[k]);
        }
    }
}
