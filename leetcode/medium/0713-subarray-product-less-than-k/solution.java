class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k)
    {
       int prod = 1;
        int l = 0, count = 0;
        while(k<=1)
        return 0;

        for (int i = 0; i < arr.length; i++) {

            prod *= arr[i];

            while (prod >= k) {
                prod /= arr[l];
                l++;
            }

            count += i - l + 1;
        }

        return count;
    }
}