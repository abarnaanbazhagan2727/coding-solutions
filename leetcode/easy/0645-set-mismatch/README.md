# Set Mismatch

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in  **repetition of one**  number and  **loss of another**  number.

You are given an integer array `nums` representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return  *them in the form of an array*.

 

 **Example 1:** 

```
Input: nums = [1,2,2,4]
Output: [2,3]

```

 **Example 2:** 

```
Input: nums = [1,1]
Output: [1,2]

```

 

 **Constraints:** 

- 2 <= nums.length <= 104
- 1 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 94.92%)  
**Memory:** 47.8 MB (beats 24.16%)  
**Submitted:** 2026-09-28T01:11:41.508Z  

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int[] result = new int[2];

        // Count frequencies of each number
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            freq[value] = freq[value] + 1;
        }

        // Find the duplicate and missing number
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                result[0] = i; // Duplicate number
            } else if (freq[i] == 0) {
                result[1] = i; // Missing number
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/set-mismatch/)