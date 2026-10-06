class Solution {
    public int compress(char[] chars) {
      int r=0;
      int w=0;
      while(r<chars.length){
        char curr=chars[r];
        int c=0;
        while(r<chars.length && curr==chars[r]){
           c++;
           r++;
        }
        chars[w++]=curr;
        if(c>1){
            String val=String.valueOf(c);
            for(char x:val.toCharArray()){
                chars[w++]=x;
            }
        }
      } 
      return w;  
    }
}