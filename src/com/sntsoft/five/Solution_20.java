package com.sntsoft.five;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author lc
 * @date 2021/5/20 15:45
 */
public class Solution_20 {
    public List<String> topKFrequent(String[] words, int k) {

        LinkedList<String> list1 = new LinkedList<>();

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> list2 = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
            //升序排序
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().equals(o2.getValue())) {
                    return -o1.getKey().compareTo(o2.getKey());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (int i = list2.size() - 1; i > list2.size() - k - 1; i--) {
            list1.add(list2.get(i).getKey());
        }

        return list1;
    }
}
