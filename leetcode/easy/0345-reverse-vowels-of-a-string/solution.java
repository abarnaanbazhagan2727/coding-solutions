class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(new String(s));

        int j = sb.length() - 1;

        for (int i = 0; i < sb.length(); i++) {

            if (!(sb.charAt(i) == 'A' || sb.charAt(i) == 'E' ||
                  sb.charAt(i) == 'I' || sb.charAt(i) == 'O' ||
                  sb.charAt(i) == 'U' || sb.charAt(i) == 'a' ||
                  sb.charAt(i) == 'e' || sb.charAt(i) == 'i' ||
                  sb.charAt(i) == 'o' || sb.charAt(i) == 'u')) {
                continue;
            }

            while (j > i) {

                if (sb.charAt(j) == 'A' || sb.charAt(j) == 'E' ||
                    sb.charAt(j) == 'I' || sb.charAt(j) == 'O' ||
                    sb.charAt(j) == 'U' || sb.charAt(j) == 'a' ||
                    sb.charAt(j) == 'e' || sb.charAt(j) == 'i' ||
                    sb.charAt(j) == 'o' || sb.charAt(j) == 'u') {

                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);

                    j--;
                    break;
                }

                j--;
            }
        }

        return sb.toString();
    }
}