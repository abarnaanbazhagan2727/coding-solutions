# Find All Numbers Disappeared in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, return  *an array of all the integers in the range*  `[1, n]`  *that do not appear in*  `nums`.

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

```

 **Example 2:** 

```
Input: nums = [1,1]
Output: [2]

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n

 

 **Follow up:**  Could you do it without extra space and in `O(n)` runtime? You may assume the returned list does not count as extra space.

## Solution

**Language:** Java  
**Runtime:** 20 ms (beats 33.82%)  
**Memory:** 74.3 MB (beats 28.30%)  
**Submitted:** 2026-09-25T09:13:24.976Z  

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Boolean> h=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(int x:nums)
        {
          h.put(x,true);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!h.containsKey(i))
            al.add(i);
        }
        return al;
        
    }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)