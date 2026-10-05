class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m=new HashMap<>();
        for(String x:strs){
            char[] arr=x.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!m.containsKey(s)){
                m.put(s,new ArrayList<>());
            }
            m.get(s).add(x);
        }
        return new ArrayList<>(m.values());
    }
}