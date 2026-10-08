class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int l = 0, r = 0;

        while (l < haystack.length()) {

            while (r < needle.length()) {

                if (haystack.charAt(l) == needle.charAt(r)) {

                    l++;
                    r++;

                    if (r == needle.length()) {
                        return l - r;
                    }
                    if (l == haystack.length()) {
                        return -1;
                    }
                }
                else {
                    l = l - r + 1;
                    r = 0;
                    break;
                }
            }
        }

        return -1;
    }
}