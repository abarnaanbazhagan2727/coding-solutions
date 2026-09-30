# Binary Subarrays With Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums` and an integer `goal`, return  *the number of non-empty  **subarrays**  with a sum*  `goal`.

A  **subarray**  is a contiguous part of the array.

 

 **Example 1:** 

```
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

```

 **Example 2:** 

```
Input: nums = [0,0,0,0,0], goal = 0
Output: 15

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- nums[i] is either 0 or 1.
- 0 <= goal <= nums.length

## Solution

**Language:** Java  
**Runtime:** 2614 ms (beats 5.08%)  
**Memory:** 50.5 MB (beats 88.21%)  
**Submitted:** 2026-09-30T04:29:30.426Z  

```java
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==goal)
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

[View on LeetCode](https://leetcode.com/problems/binary-subarrays-with-sum/)