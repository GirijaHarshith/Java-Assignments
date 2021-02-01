package com.consultadd.Task7;

import java.util.HashMap;
import java.util.Map;

/*
* 12. Program to find all the sub-array whose sum is equal to the given number?
* @author Girija
*/
public class Q12 {
    public static void main(String[] args) {
        Q12 q12=new Q12();
        int[] arr={3,1,-4,4,2,2};
        int target=4;
        System.out.println(q12.subarraySum(arr,target));
    }

    private int subarraySum(int[] arr,int target) {
        int count=0;
        int sum=0;
        int prefixSum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];

            if(prefixSum==target)
                count+=1;

            if(hm.containsKey(prefixSum-target))
                count+=hm.get(prefixSum-target);

            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}

