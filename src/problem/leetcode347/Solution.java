package problem.leetcode347;

import java.util.*;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //根据value排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) ->
                o2.getValue().compareTo(o1.getValue()));

        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
        int k = 2;
        int[] ints = solution.topKFrequent(arr, k);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
