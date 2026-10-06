# Reverse Vowels of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

 

 **Example 1:** 

 **Input:**  s = "IceCreAm"

 **Output:**  "AceCreIm"

 **Explanation:** 

The vowels in `s` are `['I', 'e', 'e', 'A']`. On reversing the vowels, s becomes `"AceCreIm"`.

 **Example 2:** 

 **Input:**  s = "leetcode"

 **Output:**  "leotcede"

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consist of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 8.60%)  
**Memory:** 45.6 MB (beats 97.94%)  
**Submitted:** 2026-10-06T05:29:18.143Z  

```java
class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(new String(s));

        int j = sb.length() - 1;

        for (int i = 0; i < sb.length(); i++) {

            if (!(sb.charAt(i) == 'A' || sb.charAt(i) == 'E' ||
                  sb.charAt(i) == 'I' || sb.charAt(i) == 'O' ||
                  sb.charAt(i) == 'U' || sb.charAt(i) == 'a' ||
                  sb.charAt(i) == 'e' || sb.charAt(i) == 'i' ||
                  sb.charAt(i) == 'o' || sb.charAt(i) == 'u')) {
                continue;
            }

            while (j > i) {

                if (sb.charAt(j) == 'A' || sb.charAt(j) == 'E' ||
                    sb.charAt(j) == 'I' || sb.charAt(j) == 'O' ||
                    sb.charAt(j) == 'U' || sb.charAt(j) == 'a' ||
                    sb.charAt(j) == 'e' || sb.charAt(j) == 'i' ||
                    sb.charAt(j) == 'o' || sb.charAt(j) == 'u') {

                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);

                    j--;
                    break;
                }

                j--;
            }
        }

        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)