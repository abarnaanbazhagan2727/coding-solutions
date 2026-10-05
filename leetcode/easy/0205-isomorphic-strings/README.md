# Isomorphic Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`,  *determine if they are isomorphic*.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

 **Example 1:** 

 **Input:**  s = "egg", t = "add"

 **Output:**  true

 **Explanation:** 

The strings `s` and `t` can be made identical by:

- Mapping 'e' to 'a'.
- Mapping 'g' to 'd'.

 **Example 2:** 

 **Input:**  s = "f11", t = "b23"

 **Output:**  false

 **Explanation:** 

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

 **Example 3:** 

 **Input:**  s = "paper", t = "title"

 **Output:**  true

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- t.length == s.length
- s and t consist of any valid ascii character.

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 39.99%)  
**Memory:** 44 MB (beats 25.56%)  
**Submitted:** 2026-10-05T07:21:44.730Z  

```java
class Solution { public boolean isIsomorphic(String s, String t) { if (s.length() != t.length()) { return false; } HashMap<Character, Character> m1 = new HashMap<>(); HashMap<Character, Character> m2 = new HashMap<>(); for (int i = 0; i < s.length(); i++) { char h = s.charAt(i); char m = t.charAt(i); if (m1.containsKey(h)) { if (m1.get(h) != m) { return false; } } else { m1.put(h, m); } if (m2.containsKey(m)) { if (m2.get(m) != h) { return false; } } else { m2.put(m, h); } } return true; } }
```

---

[View on LeetCode](https://leetcode.com/problems/isomorphic-strings/)