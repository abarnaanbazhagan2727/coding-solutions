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