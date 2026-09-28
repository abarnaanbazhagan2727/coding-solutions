# Maximum Nesting Depth of the Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **valid parentheses string**  `s`, return the  **nesting depth**  of `s`. The nesting depth is the  **maximum**  number of nested parentheses.

 

 **Example 1:** 

 **Input:**  s = "(1+(2*3)+((8)/4))+1"

 **Output:**  3

 **Explanation:** 

Digit 8 is inside of 3 nested parentheses in the string.

 **Example 2:** 

 **Input:**  s = "(1)+((2))+(((3)))"

 **Output:**  3

 **Explanation:** 

Digit 3 is inside of 3 nested parentheses in the string.

 **Example 3:** 

 **Input:**  s = "()(())((()()))"

 **Output:**  3

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
- It is guaranteed that parentheses expression s is a VPS.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 15.94%)  
**Submitted:** 2026-09-28T00:56:25.006Z  

```java
class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int ans = 0;

        for(char ch : s.toCharArray()) {

            if(ch == '(') {
                counter++;

                // Update maximum nesting depth
                ans = Math.max(ans, counter);
            }
            else if(ch == ')') {
                counter--;
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)