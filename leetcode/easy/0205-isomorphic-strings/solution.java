class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Character> m1=new HashMap<>();
        HashMap<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(m1.containsKey(ch1)){
                if(m1.get(ch1)!=ch2)
                {
                    return false;
                }

            }
            if(m2.containsKey(ch2)){
                if(m2.get(ch2)!=ch1){
                    return false;
                }
            }
            m1.put(ch1,ch2);
            m2.put(ch2,ch1);
        }
        return true;
    }
}