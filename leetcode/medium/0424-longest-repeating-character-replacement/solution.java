class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq=new int[26];
       int l=0;
       int maxfre=0,maxlen=0;
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'A']++;
        maxfre=Math.max(maxfre,freq[s.charAt(i)-'A']);
        while((i-l+1)-maxfre>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }
        maxlen=Math.max(maxlen,i-l+1);
       }
     return maxlen;
    }
}