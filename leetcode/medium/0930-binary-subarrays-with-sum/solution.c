int numSubarraysWithSum(int* nums, int numsSize, int goal) {
    int count[numsSize + 1];
    for (int i = 0; i <= numsSize; i++)
        count[i] = 0;

    int sum = 0;
    int ans = 0;

    count[0] = 1;

    for (int i = 0; i < numsSize; i++) {
        sum += nums[i];

        if (sum >= goal)
            ans += count[sum - goal];

        count[sum]++;
    }

    return ans;
}