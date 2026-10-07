class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
         int l = 0;
        int cost = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            cost+=Math.abs(s.charAt(i)-t.charAt(i));
            while(cost>maxCost)
            {
                cost-= Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
        
    }
}