# Add Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-negative integers, `num1` and `num2` represented as string, return  *the sum of*  `num1`  *and*  `num2`  *as a string*.

You must solve the problem without using any built-in library for handling large integers (such as `BigInteger`). You must also not convert the inputs to integers directly.

 

 **Example 1:** 

```
Input: num1 = "11", num2 = "123"
Output: "134"

```

 **Example 2:** 

```
Input: num1 = "456", num2 = "77"
Output: "533"

```

 **Example 3:** 

```
Input: num1 = "0", num2 = "0"
Output: "0"

```

 

 **Constraints:** 

- 1 <= num1.length, num2.length <= 104
- num1 and num2 consist of only digits.
- num1 and num2 don't have any leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 94.44%)  
**Memory:** 43.7 MB (beats 74.67%)  
**Submitted:** 2026-10-06T06:53:27.198Z  

```java
class Solution {
    public String addStrings(String num1, String num2) {
        int i= num1.length()-1;
        int j = num2.length()-1;
        int carry =0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0||carry!=0)
        {
            int d1=(i>=0)?num1.charAt(i)-'0':0;
            int d2=(j>=0)?num2.charAt(j)-'0':0;
            int sum = d1+d2+carry;
             carry = sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-strings/)