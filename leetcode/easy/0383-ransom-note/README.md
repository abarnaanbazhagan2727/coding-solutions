# Ransom Note

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `ransomNote` and `magazine`, return `true` *if* `ransomNote` *can be constructed by using the letters from* `magazine` *and* `false` *otherwise*.

Each letter in `magazine` can only be used once in `ransomNote`.

 

 **Example 1:** 

```
Input: ransomNote = "a", magazine = "b"
Output: false

```

 **Example 2:** 

```
Input: ransomNote = "aa", magazine = "ab"
Output: false

```

 **Example 3:** 

```
Input: ransomNote = "aa", magazine = "aab"
Output: true

```

 

 **Constraints:** 

- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 35 ms (beats 7.40%)  
**Memory:** 46.6 MB (beats 42.84%)  
**Submitted:** 2026-10-05T15:54:51.037Z  

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Set<Character> ransomSet = new HashSet<>();
        for (char c : ransomNote.toCharArray()) {
            ransomSet.add(c);
        }

        for (char c : ransomSet) {
            if (countOccurrences(magazine, c) < countOccurrences(ransomNote, c)) {
                return false;
            }
        }
        return true;
    }

    private int countOccurrences(String str, char c) {
        return (int) str.chars().filter(ch -> ch == c).count();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ransom-note/)