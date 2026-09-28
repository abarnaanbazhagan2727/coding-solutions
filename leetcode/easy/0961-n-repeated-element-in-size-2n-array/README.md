# N-Repeated Element in Size 2N Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` with the following properties:

- nums.length == 2 * n.
- nums contains n + 1 unique values, n of which occur exactly once in the array.
- Exactly one element of nums is repeated n times.

Return  *the element that is repeated* `n` *times*.

 

 **Example 1:** 

```
Input: nums = [1,2,3,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,1,2,5,3,2]
Output: 2

```

 **Example 3:** 

```
Input: nums = [5,1,5,2,5,3,5,4]
Output: 5

```

 

 **Constraints:** 

- 2 <= n <= 5000
- nums.length == 2 * n
- 0 <= nums[i] <= 104
- nums contains n + 1 unique elements and one of them is repeated exactly n times.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.4 MB (beats 56.36%)  
**Submitted:** 2026-09-28T03:12:31.257Z  

```java
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int ans=-1;
        for(int x:nums)
        {
            if(h.contains(x))
            {
                return x;    
            }
            h.add(x);
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/)