package com.consultadd.Task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 7. Program to Count occurrences of each character in a string in java?
 * @author Girija
 */
public class Q7 {
    public static void main(String[] args) {
        Q7 q7=new Q7();
        String s="I live in USA";
        Map<Character,Integer> map=  q7.occurenceOfCharacters(s);
        q7.display(map);
}

    private Map<Character,Integer> occurenceOfCharacters(String s) {

        Map<Character,Integer> map=new HashMap<>();
        char[] c=s.toLowerCase().toCharArray();

        //for(Character c:s.toCharArray()) {
        for(int i=0;i<s.length();i++){
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i])+ 1);
            } else {
                map.put(c[i],1);
            }
        }
        return map ;
    }
    public void display(Map<Character,Integer> map){
        for(Map.Entry e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

}

