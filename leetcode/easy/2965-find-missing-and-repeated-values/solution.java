class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {

                int x = grid[i][j];

                h.put(x, h.getOrDefault(x, 0) + 1);
            }
        }

        int repeated = 0;
        int missing = 0;

        for(int i=1; i<=grid.length * grid.length; i++) {

            if(h.getOrDefault(i, 0) == 2) {
                repeated = i;
            }

            if(h.getOrDefault(i, 0) == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}