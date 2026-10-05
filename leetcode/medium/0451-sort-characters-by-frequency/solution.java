class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>l=new ArrayList<>(m.keySet());
        l.sort((a,b)->m.get(b)-m.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch:l){
            int freq=m.get(ch);
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}