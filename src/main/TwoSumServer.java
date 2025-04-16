package main;
import java.util.*;

public class TwoSumServer {
    // This method will act as our "remote method" on the server side
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array to find the two sum
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If we have already seen the complement number in the map, return the result
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // return the two indices
            }

            // Otherwise, put the number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution found, return null
        return null;
    }
}
