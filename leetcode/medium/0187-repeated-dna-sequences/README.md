# Repeated DNA Sequences

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The  **DNA sequence**  is composed of a series of nucleotides abbreviated as `'A'`, `'C'`, `'G'`, and `'T'`.

- For example, "ACGAATTCCG" is a DNA sequence.

When studying  **DNA**, it is useful to identify repeated sequences within the DNA.

Given a string `s` that represents a  **DNA sequence**, return all the  **`10`-letter-long**  sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]

```

 **Example 2:** 

```
Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is either 'A', 'C', 'G', or 'T'.

## Solution

**Language:** Java  
**Runtime:** 445 ms (beats 61.62%)  
**Memory:** 273.4 MB (beats 47.27%)  
**Submitted:** 2026-10-08T06:18:44.669Z  

```java
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    Set seen = new HashSet(), repeated = new HashSet();
    for (int i = 0; i + 9 < s.length(); i++) {
        String ten = s.substring(i, i + 10);
        if (!seen.add(ten))
            repeated.add(ten);
    }
    return new ArrayList(repeated);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/repeated-dna-sequences/)