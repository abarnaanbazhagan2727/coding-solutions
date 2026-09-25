# Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only  **one repeated number**  in `nums`, return  *this repeated number*.

You must solve the problem  **without**  modifying the array `nums` and using only constant extra space.

 

 **Example 1:** 

```
Input: nums = [1,3,4,2,2]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,1,3,4,2]
Output: 3

```

 **Example 3:** 

```
Input: nums = [3,3,3,3,3]
Output: 3
```

 

 **Constraints:** 

- 1 <= n <= 105
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only once except for precisely one integer which appears two or more times.

 

 **Follow up:** 

- How can we prove that at least one duplicate number must exist in nums?
- Can you solve the problem in linear runtime complexity?

## Solution

**Language:** Java  
**Runtime:** 33 ms (beats 16.56%)  
**Memory:** 115.4 MB (beats 5.45%)  
**Submitted:** 2026-09-25T09:04:01.081Z  

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int m=-1;
        HashSet<Integer> h=new HashSet<>();
        for(int x:nums){
            if(h.contains(x)){
                m=x;
            }
            h.add(x);
        }
        return m;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)