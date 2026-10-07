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