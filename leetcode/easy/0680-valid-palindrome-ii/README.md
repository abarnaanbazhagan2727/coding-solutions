# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`  *if the* `s` *can be palindrome after deleting  **at most one**  character from it*.

 

 **Example 1:** 

```
Input: s = "aba"
Output: true

```

 **Example 2:** 

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

```

 **Example 3:** 

```
Input: s = "abc"
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 98.22%)  
**Memory:** 47.7 MB (beats 48.00%)  
**Submitted:** 2026-10-02T15:33:27.580Z  

```java
class Solution {
    public boolean validPalindrome(String s) {
        int f = 0;
        int l = s.length() - 1;

        while (f < l) {
            if (s.charAt(f) != s.charAt(l)) {
                return isPalindrome(s, f + 1, l) ||
                       isPalindrome(s, f, l - 1);
            }
            f++;
            l--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int f, int l) {
        while (f < l) {
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)