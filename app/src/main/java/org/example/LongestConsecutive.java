package org.example;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

public class LongestConsecutive {

  public int longestConsecutive(int[] nums) {
    Set<Integer> mySet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    int longest = 0;
    for (int num : nums) {
      // System.out.println(num);
      if (!mySet.contains(num - 1)) {
        int length = 0;
        while (mySet.contains(num + length)) {
          length += 1;
        }
        longest = Math.max(length, longest);

      }
    }
    return longest;
  }
}
