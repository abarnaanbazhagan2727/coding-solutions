class Solution {
    public int balancedString(String s) {
        int n=s.length();
        int req=n/4;
        int[] freq=new int[26];
        // for(char x:s.toCharArray())
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;

        }
        if(freq['Q'-'A']==req && freq['E'-'A']==req && freq['W'-'A']==req && freq['R'-'A']==req){
            return 0;
        }
        int l=0;
        int ans=n;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']--;
            while(freq['Q'-'A']<=req && freq['E'-'A']<=req && freq['W'-'A']<=req && freq['R'-'A']<=req){
                ans=Math.min(ans,i-l+1);
               freq[s.charAt(l)-'A']++;
               l++;
        }
        }
        return ans;


    }
    }