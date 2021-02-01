package com.consultadd.Task7;
/*
* 4. Program to find if String has all Unique Characters?
* @author Girija
*/

import java.util.HashSet;
import java.util.Set;

public class Q4 {
    public static void main(String[] args) {
        Q4 q4 = new Q4();
        String str = "Java plm";
        Boolean res = q4.uniqueCharacters(str);
        System.out.println(res);
    }

    private Boolean uniqueCharacters(String s) {
        Set<Character> hset = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            if (hset.contains(ch)) {
                return false;
            } else {
                hset.add(ch);
            }
        }
        return true;
    }
}
