# Find the Index of the First Occurrence in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

 

 **Example 1:** 

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

```

 **Example 2:** 

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

```

 

 **Constraints:** 

- 1 <= haystack.length, needle.length <= 104
- haystack and needle consist of only lowercase English characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 8.89%)  
**Memory:** 42.9 MB (beats 67.84%)  
**Submitted:** 2026-10-08T05:52:23.562Z  

```java
class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int l = 0, r = 0;

        while (l < haystack.length()) {

            while (r < needle.length()) {

                if (haystack.charAt(l) == needle.charAt(r)) {

                    l++;
                    r++;

                    if (r == needle.length()) {
                        return l - r;
                    }
                    if (l == haystack.length()) {
                        return -1;
                    }
                }
                else {
                    l = l - r + 1;
                    r = 0;
                    break;
                }
            }
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)