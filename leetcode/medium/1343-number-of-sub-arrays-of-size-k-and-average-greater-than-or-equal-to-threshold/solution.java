class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int count=0;
        int window=0;

        for(int i=0; i<k; i++){
            window +=arr[i];
        }
        if(window/k>=threshold) count++;

        for(int i=k; i<n; i++){
            window +=arr[i]-arr[i-k];
            if(window/k>=threshold) count++;
        }
        return count;
    }
}