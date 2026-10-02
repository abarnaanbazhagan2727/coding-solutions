class Solution {
    public boolean validPalindrome(String s) {
        int f = 0;
        int l = s.length() - 1;

        while (f < l) {
            if (s.charAt(f) != s.charAt(l)) {
                return isPalindrome(s, f + 1, l) ||
                       isPalindrome(s, f, l - 1);
            }
            f++;
            l--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int f, int l) {
        while (f < l) {
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
}