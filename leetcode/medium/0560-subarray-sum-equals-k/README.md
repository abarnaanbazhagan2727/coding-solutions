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
**Runtime:** 1133 ms (beats 24.14%)  
**Memory:** 48.4 MB (beats 86.83%)  
**Submitted:** 2026-09-28T08:14:37.660Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        
        int res[]=new int[nums.length+1];
        res[0]=0;
        for(int i=1;i<=nums.length;i++)
        {
            res[i]=res[i-1]+nums[i-1];
        }
        for(int j=0;j<res.length;j++)
        {
            for(int m=j+1;m<res.length;m++)
            {
                if(res[m]-res[j]==k)
                {
                    c++;
                }
            }
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)