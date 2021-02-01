package com.consultadd.Task7;
/*
* 2. Program to find the first non-repeated character in the String
*
* @author Girija
*/

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        String str="aaapccb";//"aJava plm";
        char res=q2.nonRepeatedCharcter(str);
        if(res=='0')
            System.out.println("There is no non repeating character");
        else
            System.out.println(res);
    }

    private char nonRepeatedCharcter(String s) {
        char[] ch=s.toCharArray();
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else
                map.put(ch[i],1);
        }

        for (Map.Entry e:map.entrySet()) {
           if((int)e.getValue() == 1)
                return (char)e.getKey();
        }

        return '0';
    }
}
