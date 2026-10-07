# Number of Substrings Containing All Three Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` consisting only of characters  *a*,  *b*  and  *c*.

Return the number of substrings containing  **at least**  one occurrence of all these characters  *a*,  *b*  and  *c*.

 

 **Example 1:** 

```
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 

```

 **Example 2:** 

```
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 

```

 **Example 3:** 

```
Input: s = "abc"
Output: 1

```

 

 **Constraints:** 

- 3 <= s.length <= 5 x 104
- s only consists of 'a', 'b' or 'c' characters.

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 26.66%)  
**Memory:** 46.3 MB (beats 62.52%)  
**Submitted:** 2026-10-07T17:05:02.360Z  

```java
class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, c = 0;
        int[] freq = new int[3];

        for (int r = 0; r < s.length(); r++) {

            freq[s.charAt(r) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                c += s.length() - r;

                freq[s.charAt(l) - 'a']--;
                l++;
            }
        }

        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)