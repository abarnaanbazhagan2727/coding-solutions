class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Set<Character> ransomSet = new HashSet<>();
        for (char c : ransomNote.toCharArray()) {
            ransomSet.add(c);
        }

        for (char c : ransomSet) {
            if (countOccurrences(magazine, c) < countOccurrences(ransomNote, c)) {
                return false;
            }
        }
        return true;
    }

    private int countOccurrences(String str, char c) {
        return (int) str.chars().filter(ch -> ch == c).count();
    }
}