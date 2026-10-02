class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder ans = new StringBuilder();
         int maxLength = Math.max(word1.length(), word2.length());
        for(int i=0;i<maxLength;i++)
        {
            if(i<word1.length()){
                ans.append(word1.charAt(i));
            }
        if(i<word2.length()){
            ans.append(word2.charAt(i));
        }
    }
      return ans.toString();  
        
    }
}