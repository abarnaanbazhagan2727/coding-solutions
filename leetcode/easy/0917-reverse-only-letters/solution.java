class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars=s.toCharArray();
        int l=0;
        int r=chars.length-1;
        while(l<r){
            while(l<r && !Character.isLetter(chars[l])){
                l++;
            }
            while(l<r && !Character.isLetter(chars[r])){
                r--;
            }
            if(l<r)
            {
                char temp=chars[l];
                chars[l]=chars[r];
                chars[r]=temp;
                l++;
                r--;
            }
        }
        return new String(chars);
        
    }
}