class Solution {

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(new String(s));

        for (int i = 0; i < sb.length(); i++) {

            if (!Character.isLetterOrDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        String a = sb.toString();

        sb.reverse();

        return a.equalsIgnoreCase(sb.toString());
    }
}