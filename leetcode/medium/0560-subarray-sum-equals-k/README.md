# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 28 ms (beats 27.42%)  
**Memory:** 48.9 MB (beats 34.18%)  
**Submitted:** 2026-09-28T08:36:47.307Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m =new HashMap<>();
        int sum=0;
        int c=0;
        m.put(0,1);
        for(int x:nums)
        {
            sum+=x;
            int req = sum-k;
            if(m.containsKey(req)){
                c+=m.get(req);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)