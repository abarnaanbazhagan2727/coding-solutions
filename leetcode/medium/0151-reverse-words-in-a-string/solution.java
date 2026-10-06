class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] spl= s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=spl.length-1;i>=0;i--)
        {
           sb.append(spl[i]);
           if(i!=0){
            sb.append(" ");
           }
        }
        return sb.toString();

        
    }
}