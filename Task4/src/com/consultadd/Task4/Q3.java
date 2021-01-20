package com.consultadd.Task4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleToIntFunction;

/*
 * 3. Write a Java program to find the second smallest element in an array. .
 *
 * @author Girija
 */
public class Q3 {
    public static void main(String[] args) {
        Q3 q3=new Q3();
        q3.secondSmallest();
    }
    public void secondSmallest() {
        int[] arr = {1,3,4,2,4,2};
        int len = arr.length;
        if(len<2){
            System.out.println("Number of elements < 2");
            return;
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int j = 0;
        list.add(arr[0]);
        for (int i = 1; i < len; i++) {
            if (arr[i] != arr[j]) {
                list.add(arr[i]);
            }
            j++;
        }
        int[] res=new int[list.size()];
        System.out.print("After removing duplicates : ");
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
            System.out.print(res[i]);
        }
        System.out.println("\nSecond smallest element in an array: "+ res[1]);
      //  return res;
    }
}
