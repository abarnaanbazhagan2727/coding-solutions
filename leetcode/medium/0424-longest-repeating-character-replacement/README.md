# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 69.82%)  
**Memory:** 46 MB (beats 79.17%)  
**Submitted:** 2026-10-10T03:23:33.501Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq=new int[26];
       int l=0;
       int maxfre=0,maxlen=0;
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'A']++;
        maxfre=Math.max(maxfre,freq[s.charAt(i)-'A']);
        while((i-l+1)-maxfre>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }
        maxlen=Math.max(maxlen,i-l+1);
       }
     return maxlen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)