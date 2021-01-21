package com.consultadd.Task5;
/*
* 4. Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive
*  i.e. all the letters of the string be unique (isogram) else false.
*
* @author Girija
*/
public class Q4 {
    public static void main(String[] args) {
        Q4 q4=new Q4();
        String str="aa";//"ProgrammingLanguages";
        boolean res=q4.isogram(str);
        System.out.println("Isogram :"+res);
    }

    private boolean isogram(String s) {
       char[] ch= s.toLowerCase().toCharArray();
       int[] arr=new int[26];
       for(char c:ch){
           if(++arr[c-'a'] > 1)
               return false;
       }
        return true;
    }
}
