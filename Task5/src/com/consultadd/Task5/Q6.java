package com.consultadd.Task5;
/*
* 6. Write a JAVA program that swaps the case of the alphabets of the string,
* For eg,  => “heLLo WOrLd” => “HEllO woRlD”.
*
* @author Girija
*/
public class Q6 {
    public static void main(String[] args) {
        Q6 q6=new Q6();
        String str="heLLo WOrLd";
        String result=q6.swapCaseAlphabets(str);
        System.out.println("Swapping Alpabhets Case:"+result);
    }

    private String swapCaseAlphabets(String str) {
        char[] charr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            char ch=charr[i];
            //if(ch-'a' >='a'-'a' && ch-'a'<='z'-'a')     //ASCII value of a is (int)'a';
            if(Character.isLowerCase(ch))
                charr[i]=Character.toUpperCase(ch);
            else
                charr[i]=Character.toLowerCase(ch);
        }
        return new String(charr);
    }
}
