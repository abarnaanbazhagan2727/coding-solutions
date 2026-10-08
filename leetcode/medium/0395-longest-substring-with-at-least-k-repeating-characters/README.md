# Longest Substring with At Least K Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and an integer `k`, return  *the length of the longest substring of*  `s`  *such that the frequency of each character in this substring is greater than or equal to*  `k`.

if no such substring exists, return 0.

 

 **Example 1:** 

```
Input: s = "aaabb", k = 3
Output: 3
Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.

```

 **Example 2:** 

```
Input: s = "ababbc", k = 2
Output: 5
Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of only lowercase English letters.
- 1 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 60 ms (beats 35.38%)  
**Memory:** 47 MB (beats 28.11%)  
**Submitted:** 2026-10-08T04:49:25.776Z  

```java
class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(fre[s.charAt(i)-'a']<k){
                int l=longestSubstring(s.substring(0,i),k);//2
                int r=longestSubstring(s.substring(i+1),k);//3
                return Math.max(l,r);
            }
        }
        return s.length();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/)