# Number of Equivalent Domino Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a list of `dominoes`, `dominoes[i] = [a, b]` is  **equivalent to**  `dominoes[j] = [c, d]` if and only if either (`a == c` and `b == d`), or (`a == d` and `b == c`) - that is, one domino can be rotated to be equal to another domino.

Return  *the number of pairs* `(i, j)` *for which* `0 <= i < j < dominoes.length` *, and* `dominoes[i]` *is  **equivalent to*** `dominoes[j]`.

 

 **Example 1:** 

```
Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1

```

 **Example 2:** 

```
Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
Output: 3

```

 

 **Constraints:** 

- 1 <= dominoes.length <= 4 * 104
- dominoes[i].length == 2
- 1 <= dominoes[i][j] <= 9

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 45.87%)  
**Memory:** 55.7 MB (beats 55.05%)  
**Submitted:** 2026-10-07T06:16:07.945Z  

```java
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;

        for (int i = 0; i < dominoes.length; i++) {
            
            int a = dominoes[i][0];
            int b = dominoes[i][1];

            int key = Math.min(a, b) * 10 + Math.max(a, b);

            count += h.getOrDefault(key, 0);

            h.put(key, h.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-equivalent-domino-pairs/)