# Replace the Substring for Balanced String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string s of length `n` containing only four kinds of characters: `'Q'`, `'W'`, `'E'`, and `'R'`.

A string is said to be  **balanced**  if each of its characters appears `n / 4` times where `n` is the length of the string.

Return  *the minimum length of the substring that can be replaced with  **any**  other string of the same length to make* `s` ***balanced***. If s is already  **balanced**, return `0`.

 

 **Example 1:** 

```
Input: s = "QWER"
Output: 0
Explanation: s is already balanced.

```

 **Example 2:** 

```
Input: s = "QQWE"
Output: 1
Explanation: We need to replace a 'Q' to 'R', so that "RQWE" (or "QRWE") is balanced.

```

 **Example 3:** 

```
Input: s = "QQQW"
Output: 2
Explanation: We can replace the first "QQ" to "ER". 

```

 

 **Constraints:** 

- n == s.length
- 4 <= n <= 105
- n is a multiple of 4.
- s contains only 'Q', 'W', 'E', and 'R'.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 78.89%)  
**Memory:** 44.7 MB (beats 80.24%)  
**Submitted:** 2026-10-07T09:03:16.659Z  

```java
class Solution {
    public int balancedString(String s) {
        int n=s.length();
        int req=n/4;
        int[] freq=new int[26];
        // for(char x:s.toCharArray())
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;

        }
        if(freq['Q'-'A']==req && freq['E'-'A']==req && freq['W'-'A']==req && freq['R'-'A']==req){
            return 0;
        }
        int l=0;
        int ans=n;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']--;
            while(freq['Q'-'A']<=req && freq['E'-'A']<=req && freq['W'-'A']<=req && freq['R'-'A']<=req){
                ans=Math.min(ans,i-l+1);
               freq[s.charAt(l)-'A']++;
               l++;
        }
        }
        return ans;


    }
    }
```

---

[View on LeetCode](https://leetcode.com/problems/replace-the-substring-for-balanced-string/)