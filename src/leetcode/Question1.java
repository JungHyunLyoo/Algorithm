package leetcode;
/*
 * @USER JungHyun
 * @DATE 2020-05-12
 * @DESCRIPTION
 */

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        int[] intArr = new int[]{2, 7, 11, 15};
        int[] result = twoSumUsingArray(intArr, 9);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(i);
            if (i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    static private int[] twoSumUsingArray(int[] nums, int target) {
        //Brute Force
        //tc : o(n^2)
        //sc : o(1)
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*
     * 배열의 각 요소와 각 인덱스를 매핑하는 가장 좋은 방법은 HashTable을 사용하는 것!
     * 매핑을 통해 시간복잡도를 O(n) -> O(1)로 줄일 수 있다. (한 사이클을 없앨 수 있음)
     * HashTable은 탐색에 상수에 가까운 시간을 소비한다.
     * '가까운' 이라고 표현한 것은, 최악의 경우에 O(n)으로 악화될 수 있기 때문
     * But look up in hash table should be amortized O(1)O(1) time as long as the hash function was chosen carefully
     */
    static private int[] twoSumUsingHashMap(int[] nums, int target) {
        //Two-pass Hash Table
        //tc : o(n)
        //sc : o(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && i != map.get(complement)) {
                return new int[]{map.get(complement), i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    static private int[] twoSumUsingHashMap2(int[] nums, int target) {
        //One-pass Hash Table
        //tc : o(n)
        //sc : o(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
