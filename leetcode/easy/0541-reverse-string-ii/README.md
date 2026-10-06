# Reverse String II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than or equal to `k` characters, then reverse the first `k` characters and leave the other as original.

 

 **Example 1:** 

```
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

```

 **Example 2:** 

```
Input: s = "abcd", k = 2
Output: "bacd"

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of only lowercase English letters.
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 11.90%)  
**Memory:** 44.8 MB (beats 61.37%)  
**Submitted:** 2026-10-06T15:42:08.141Z  

```java
class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while(i < n) {
            int left = i;
            int right = Math.min(i+k-1, n-1);

            while(left < right) {
                char ch = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, ch);

                left++;
                right--;
            }

            i = i + 2 * k;
        }

        return sb.toString();
    }
} 
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string-ii/)