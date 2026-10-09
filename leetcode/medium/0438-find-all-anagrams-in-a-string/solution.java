class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al =new ArrayList<>();
        if(s.length()<p.length())
        {
            return al;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c:p.toCharArray())
        {
            freq1[c-'a']++;
        }
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            freq2[s.charAt(i)-'a']++;
            while(i-l+1 > p.length())
            {
                freq2[s.charAt(l)-'a']--;
                l++;
            }
            if(i-l+1==p.length())
            {
                if(Arrays.equals(freq1,freq2))
                {
                    al.add(l);
                }
            }
        }
         return al;
        
    }
}