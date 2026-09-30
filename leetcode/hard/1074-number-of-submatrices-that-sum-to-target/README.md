# Number of Submatrices That Sum to Target

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a `matrix` and a `target`, return the number of non-empty submatrices that sum to target.

A submatrix `x1, y1, x2, y2` is the set of all cells `matrix[x][y]` with `x1 <= x <= x2` and `y1 <= y <= y2`.

Two submatrices `(x1, y1, x2, y2)` and `(x1', y1', x2', y2')` are different if they have some coordinate that is different: for example, if `x1 != x1'`.

 

 **Example 1:** 

```
Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
Output: 4
Explanation: The four 1x1 submatrices that only contain 0.

```

 **Example 2:** 

```
Input: matrix = [[1,-1],[-1,1]], target = 0
Output: 5
Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.

```

 **Example 3:** 

```
Input: matrix = [[904]], target = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= matrix.length <= 100
- 1 <= matrix[0].length <= 100
- -1000 <= matrix[i][j] <= 1000
- -10^8 <= target <= 10^8

## Solution

**Language:** Java  
**Runtime:** 140 ms (beats 55.64%)  
**Memory:** 47.5 MB (beats 17.68%)  
**Submitted:** 2026-09-30T08:14:20.283Z  

```java
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int r = matrix.length;
        int c = matrix[0].length;
        int count = 0;

        for (int i = 0; i < r; i++) {

            int cols[] = new int[c];

            for (int j = i; j < r; j++) {

                for (int k = 0; k < c; k++) {
                    cols[k] += matrix[j][k];
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int sum = 0;

                for (int k = 0; k < c; k++) {

                    sum += cols[k];

                    int req = sum - target;

                    if (map.containsKey(req)) {
                        count += map.get(req);
                    }

                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/)