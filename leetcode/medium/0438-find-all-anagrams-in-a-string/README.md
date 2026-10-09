# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 91.78%)  
**Memory:** 46.8 MB (beats 70.65%)  
**Submitted:** 2026-10-09T03:14:56.302Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al =new ArrayList<>();
        if(s.length()<p.length())
        {
            return al;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c:p.toCharArray())
        {
            freq1[c-'a']++;
        }
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            freq2[s.charAt(i)-'a']++;
            while(i-l+1 > p.length())
            {
                freq2[s.charAt(l)-'a']--;
                l++;
            }
            if(i-l+1==p.length())
            {
                if(Arrays.equals(freq1,freq2))
                {
                    al.add(l);
                }
            }
        }
         return al;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)