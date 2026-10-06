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
**Runtime:** 3 ms (beats 58.90%)  
**Memory:** 46.7 MB (beats 48.10%)  
**Submitted:** 2026-10-06T05:40:25.031Z  

```java
class Solution {
    public String reverseVowels(String s) {

        char[] a = s.toCharArray();

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            while (left < right && !isVowel(a[left])) {
                left++;
            }

            while (left < right && !isVowel(a[right])) {
                right--;
            }

            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        return new String(a);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)