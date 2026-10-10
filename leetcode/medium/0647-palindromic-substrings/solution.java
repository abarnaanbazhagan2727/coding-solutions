class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int l=ispali(s,i,i);
            int r=ispali(s,i,i+1);
            c+=l;
            c+=r;
            
    }
    return c;
    }
   int ispali(String s,int l,int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
       return count;
    }
}