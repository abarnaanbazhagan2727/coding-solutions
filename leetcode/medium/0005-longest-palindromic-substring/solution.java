class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String v=s.substring(i,j+1);
                if(func(v))
                {
                    if(v.length()>ans.length()){
                        ans=v;
                    }
               
                }
            }
        }
        return ans;
    }
        boolean func(String str)
        {
            int l=0;
            int r=str.length()-1;
            while(l<r){
                if(str.charAt(l)!=str.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
           
        }
    
}