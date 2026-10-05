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
**Runtime:** 26 ms (beats 5.20%)  
**Memory:** 44.4 MB (beats 65.22%)  
**Submitted:** 2026-10-05T06:12:12.191Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        {
            return false;
        }
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
            h.put(t.charAt(i), h.getOrDefault(t.charAt(i), 0) - 1);
        }
         for (int value : h.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)