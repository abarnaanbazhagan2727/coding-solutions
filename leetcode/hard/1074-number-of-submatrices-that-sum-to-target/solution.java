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