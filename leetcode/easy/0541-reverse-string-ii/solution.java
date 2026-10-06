class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while(i < n) {
            int left = i;
            int right = Math.min(i+k-1, n-1);

            while(left < right) {
                char ch = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, ch);

                left++;
                right--;
            }

            i = i + 2 * k;
        }

        return sb.toString();
    }
} 