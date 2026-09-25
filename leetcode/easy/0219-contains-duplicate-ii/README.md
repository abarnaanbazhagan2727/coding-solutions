# Contains Duplicate II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return `true`  *if there are two  **distinct indices*** `i` *and* `j` *in the array such that* `nums[i] == nums[j]` *and* `abs(i - j) <= k`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1], k = 3
Output: true

```

 **Example 2:** 

```
Input: nums = [1,0,1,1], k = 1
Output: true

```

 **Example 3:** 

```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- 0 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 28 ms (beats 81.90%)  
**Memory:** 124.8 MB (beats 18.45%)  
**Submitted:** 2026-09-25T03:38:40.773Z  

```java
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (s.containsKey(nums[i])) {

                int oldIndex = s.get(nums[i]);

                if (i - oldIndex <= k) {
                    return true;
                }
            }

            s.put(nums[i], i);
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/)