class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount = 0;
        int maxCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }

        maxCount = vowelCount;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Remove the element leaving the window
            if (isVowel(s.charAt(i - k))) {
                vowelCount--;
            }

            // Add the new element entering the window
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }

            // Update maximum
            maxCount = Math.max(maxCount, vowelCount);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || 
               c == 'o' || c == 'u';
    }
}