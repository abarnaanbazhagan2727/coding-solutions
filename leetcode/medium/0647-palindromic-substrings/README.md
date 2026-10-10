# Palindromic Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the number of  **palindromic substrings**  in it*.

A string is a  **palindrome**  when it reads the same backward as forward.

A  **substring**  is a contiguous sequence of characters within the string.

 

 **Example 1:** 

```
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

```

 **Example 2:** 

```
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 98.01%)  
**Memory:** 43 MB (beats 41.62%)  
**Submitted:** 2026-10-10T03:22:17.952Z  

```java
class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int l=ispali(s,i,i);
            int r=ispali(s,i,i+1);
            c+=l;
            c+=r;
            
    }
    return c;
    }
   int ispali(String s,int l,int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
       return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-substrings/)