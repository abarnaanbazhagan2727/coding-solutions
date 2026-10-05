# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 93.67%)  
**Memory:** 46.5 MB (beats 23.95%)  
**Submitted:** 2026-10-05T05:36:05.639Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
         char[] b = t.toCharArray(); 
         Arrays.sort(a);
         Arrays.sort(b);
       if(Arrays.equals(a,b))
        {
            return true;
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)