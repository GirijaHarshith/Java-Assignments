package com.consultadd.Task5;
/*
* 7 . Write a JAVA program that gives boolean values; true, if the string has balanced braces and false, if the string has unbalanced braces:
*     For eg,  => “[(])” //output => true
*     //valid parenthesis
*     {{(  [ ) ] }}  => “[})(” //output => false.
*
* @author Girija
*/
public class Q7 {
    public static void main(String[] args) {
        Q7 q7=new Q7();
        String str="(}){";  //true
        String str1="(})";  //false
        boolean result=q7.balancedBraces(str);
        System.out.println("Balanced braces: "+result);
    }

    private boolean balancedBraces(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                count+=1;
            else if(s.charAt(i)=='{')
                count+=2;
            else if(s.charAt(i)=='[')
                count+=3;
            else if(s.charAt(i)==')')
                count-=1;
            else if(s.charAt(i)=='}')
                count-=2;
            else if(s.charAt(i)==']')
                count-=3;
        }
        if(count==0)
            return true;
        else
            return false;
    }
}
