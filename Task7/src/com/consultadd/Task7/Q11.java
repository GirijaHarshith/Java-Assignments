package com.consultadd.Task7;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 11. Find to sort HashMap in java by keys and values?
 * @author Girija
 */
public class Q11 {
    public static void main(String[] args) {
        Q11 q11=new Q11();
        Map<Integer,Integer> map=new HashMap<>();
        map.put(10,20);
        map.put(5,30);
        map.put(9,78);
        map.put(364,8);
        q11.sortHashmapByKeys(map);
        q11.sortHashmapByValues(map);
    }

    private void sortHashmapByKeys(Map<Integer, Integer> hmap) {
        List<Map.Entry<Integer, Integer>> listMap = new ArrayList<>(hmap.entrySet());
        Collections.sort(listMap, (o1, o2) -> o1.getKey()-o2.getKey());
        System.out.println("Sorted by Keys:");
        for (Map.Entry<Integer,Integer> ele:listMap) {
            System.out.print(ele.getKey()+" ");
        }

    }

    private void sortHashmapByValues(Map<Integer,Integer> map) {
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)-> o1.getValue()-o2.getValue());
        System.out.println("\nSorted by Values:");
        for (Map.Entry<Integer,Integer> ele:list) {
            System.out.print(ele.getValue()+" ");
        }
    }
}
