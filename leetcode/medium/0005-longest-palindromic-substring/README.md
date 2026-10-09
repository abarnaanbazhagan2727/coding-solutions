# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 2582 ms (beats 5.00%)  
**Memory:** 46.8 MB (beats 32.67%)  
**Submitted:** 2026-10-09T04:33:49.003Z  

```java
class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String v=s.substring(i,j+1);
                if(func(v))
                {
                    if(v.length()>ans.length()){
                        ans=v;
                    }
               
                }
            }
        }
        return ans;
    }
        boolean func(String str)
        {
            int l=0;
            int r=str.length()-1;
            while(l<r){
                if(str.charAt(l)!=str.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
           
        }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)