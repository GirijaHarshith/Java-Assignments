package com.consultadd.Task5;
/*
* 5 .Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,
* [Text Wrapping Break]For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2
* => {22,44,64,76,98,12,43,54,90} // Output for this case =>43.
*
* @author Girija
*/

public class Q5 {
    public static void main(String[] args) {
        Q5 q5=new Q5();
        int[] arr={22,44,64,76,98,12,43,54,90};//{23,25,75,87,47,1,91,51,2};
        int res=q5.extractEvenOrOdd(arr);
        System.out.println(res);
    }
    private int extractEvenOrOdd(int[] arr) {
        int evenCount=0;
        int oddCount=0;
        int evenRes=0;
        int oddRes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                evenCount++;
                evenRes=arr[i];
            }
            else {
                oddCount++;
                oddRes=arr[i];
            }
        }

        if(evenCount==1)
            return evenRes;
        else
            return oddRes;

        /*for(int i=0;i<arr.length;i++){
            if((evenCount==1) && (arr[i]%2==0))
                    return arr[i];
            else if((oddCount==1)&&(arr[i]%2!=0))
                    return arr[i];
        }*/
    }
}
