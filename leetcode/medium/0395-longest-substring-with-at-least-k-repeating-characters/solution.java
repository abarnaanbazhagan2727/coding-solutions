class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(fre[s.charAt(i)-'a']<k){
                int l=longestSubstring(s.substring(0,i),k);//2
                int r=longestSubstring(s.substring(i+1),k);//3
                return Math.max(l,r);
            }
        }
        return s.length();
    }
}