class Solution {
    public String reverseStr(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i = i + 2*k) {

            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);

            while(left < right) {

                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }
        }

        return sb.toString();
    }
}