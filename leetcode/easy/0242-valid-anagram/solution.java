class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        {
            return false;
        }
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
            h.put(t.charAt(i), h.getOrDefault(t.charAt(i), 0) - 1);
        }
         for (int value : h.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}