# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 5.94%)  
**Memory:** 47.7 MB (beats 97.96%)  
**Submitted:** 2026-10-05T05:10:23.695Z  

```java
class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        sb.reverse();
        for(int i=0;i<s.length;i++)
        {
            s[i]=sb.charAt(i);
        }
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)