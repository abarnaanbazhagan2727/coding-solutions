# Sort Array By Parity

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all the even integers at the beginning of the array followed by all the odd integers.

Return  ***any array**  that satisfies this condition*.

 

 **Example 1:** 

```
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- 0 <= nums[i] <= 5000

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43 MB  
**Submitted:** 2026-09-30T02:25:13.458Z  

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            if(nums[left]%2 != 0 && nums[right]%2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if(nums[left]%2 == 0 && nums[right]%2 == 0){
                left++;
            }
            else if(nums[left]%2 != 0 && nums[right]%2 != 0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-parity/)