package com.sntsoft.seven;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author lc
 * @date 2021/7/9 15:26
 */
public class Solution_9 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set1 = new HashSet<>();

        for (int num : nums) {
            if (!set1.add(num)){
                return true;
            }
        }
            return false;
    }
}
