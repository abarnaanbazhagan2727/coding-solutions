# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 9.63%)  
**Memory:** 44.5 MB (beats 53.08%)  
**Submitted:** 2026-10-06T04:29:42.936Z  

```java
class Solution {

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(new String(s));

        for (int i = 0; i < sb.length(); i++) {

            if (!Character.isLetterOrDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        String a = sb.toString();

        sb.reverse();

        return a.equalsIgnoreCase(sb.toString());
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)