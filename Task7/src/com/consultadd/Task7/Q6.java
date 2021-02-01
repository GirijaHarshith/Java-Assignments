package com.consultadd.Task7;
/*
* 6. Program to check the number is Armstrong number?
 * @author Girija
*/

public class Q6 {
    public static void main(String[] args) {
        Q6 q6=new Q6();
        int num=1634;//153;
        boolean res= q6.armstrong(num);
        System.out.println("Armstrong number: "+ res);
    }

    private boolean armstrong(int num) {
        long rem=0;long sum=0;
        int length=0;
        int temp=num;
        while(num>0){
            num/=10;
            length++;
        }
        System.out.println("Number of digits: "+length);
        num=temp;
        while (num>0) {
            rem=num%10;
            sum+= Math.pow(rem, length);
            num/=10;
        }
        System.out.println("Sum is:"+sum);
        if(sum==temp)
            return true;

        return false;
    }
}
