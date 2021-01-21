package com.consultadd.Task5;
/*
* 4a. Write a JAVA program that reverse the words of a sentence.
* For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”.
*
* @author Girija
*/

public class Q4a {
    public static void main(String[] args) {
        Q4a q4a=new Q4a();
        String str="Be Happy and Stay Motivated";
        String revStr=q4a.reverseString(str);
        System.out.println("Reversing sentence: "+ revStr);
    }

    private String reverseString(String str) {
         StringBuilder sb = new StringBuilder();
         for(String word:str.split(" ")){
             String reverseWord = reverseWord(word);
             sb.append(reverseWord + " ");
         }
        return sb.toString();
    }

    private String reverseWord(String word){
        char[] charWord=word.toCharArray();
        int begin=0;int end=word.length()-1; char temp;
        while(begin<end){
            temp=charWord[begin];
            charWord[begin]=charWord[end];
            charWord[end]=temp;
            begin++;
            end--;
        }
        //System.out.print(new String(charWord) + " ");
        return charWord.toString(); //new String(charWord)
    }
}
