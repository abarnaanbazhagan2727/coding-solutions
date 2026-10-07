# Reverse Words in a String III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

 **Example 1:** 

```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

```

 **Example 2:** 

```
Input: s = "Mr Ding"
Output: "rM gniD"

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- s contains printable ASCII characters.
- s does not contain any leading or trailing spaces.
- There is at least one word in s.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 84.20%)  
**Memory:** 47.1 MB (beats 19.43%)  
**Submitted:** 2026-10-07T02:21:43.659Z  

```java
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        result.deleteCharAt(result.length() - 1);  
        return result.toString();        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)