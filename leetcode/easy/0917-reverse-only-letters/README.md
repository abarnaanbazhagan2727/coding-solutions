# Reverse Only Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the string according to the following rules:

- All the characters that are not English letters remain in the same position.
- All the English letters (lowercase or uppercase) should be reversed.

Return `s` *after reversing it*.

 

 **Example 1:** 

```
Input: s = "ab-cd"
Output: "dc-ba"

```

 **Example 2:** 

```
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

```

 **Example 3:** 

```
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of characters with ASCII values in the range [33, 122].
- s does not contain '\"' or '\\'.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 28.08%)  
**Submitted:** 2026-10-06T15:47:30.726Z  

```java
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars=s.toCharArray();
        int l=0;
        int r=chars.length-1;
        while(l<r){
            while(l<r && !Character.isLetter(chars[l])){
                l++;
            }
            while(l<r && !Character.isLetter(chars[r])){
                r--;
            }
            if(l<r)
            {
                char temp=chars[l];
                chars[l]=chars[r];
                chars[r]=temp;
                l++;
                r--;
            }
        }
        return new String(chars);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-only-letters/)