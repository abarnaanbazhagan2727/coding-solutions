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

**Language:** C  
**Runtime:** 4 ms (beats 16.79%)  
**Memory:** 10.7 MB (beats 67.15%)  
**Submitted:** 2026-09-30T04:32:54.255Z  

```c
int numSubarraysWithSum(int* nums, int numsSize, int goal) {
    int count[numsSize + 1];
    for (int i = 0; i <= numsSize; i++)
        count[i] = 0;

    int sum = 0;
    int ans = 0;

    count[0] = 1;

    for (int i = 0; i < numsSize; i++) {
        sum += nums[i];

        if (sum >= goal)
            ans += count[sum - goal];

        count[sum]++;
    }

    return ans;
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-subarrays-with-sum/)