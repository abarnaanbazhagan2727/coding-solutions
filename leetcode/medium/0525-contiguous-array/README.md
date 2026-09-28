# Contiguous Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums`, return  *the maximum length of a contiguous subarray with an equal number of* `0` *and* `1`.

 

 **Example 1:** 

```
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

```

 **Example 2:** 

```
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

```

 **Example 3:** 

```
Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 22 ms (beats 88.66%)  
**Memory:** 65.3 MB (beats 75.15%)  
**Submitted:** 2026-09-28T09:09:09.636Z  

```java
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
                nums[i] = -1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            if(map.containsKey(sum))
            {
                res = Math.max(res,i-map.get(sum));
            }
            else
            {
                map.put(sum,i);
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contiguous-array/)