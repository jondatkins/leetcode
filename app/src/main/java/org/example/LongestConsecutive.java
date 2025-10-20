package org.example;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

public class LongestConsecutive {

  public static void main(String[] args) {
    int[] nums = { 100, 4, 200, 1, 3, 2 }; // Should be 4
    System.out.println("4");
    System.out.println(new LongestConsecutive().longestConsecutive2(nums));
    int[] nums2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }; // should be 9
    System.out.println("9");
    System.out.println(new LongestConsecutive().longestConsecutive2(nums2));
    int[] nums3 = { 1, 0, 1, 2 }; // should be 3
    System.out.println("3");
    System.out.println(new LongestConsecutive().longestConsecutive2(nums3));
  }

  public int longestConsecutive(int[] nums) {
    Set<Integer> mySet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    int longest = 0;
    for (int num : nums) {
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

  public int longestConsecutive2(int[] nums) {
    int longest = 0;
    return longest;
  }
}
