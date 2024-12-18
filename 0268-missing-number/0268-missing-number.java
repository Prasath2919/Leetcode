class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int excepted_sum=n*(n+1)/2;
        int actual_sum=0;

        for(int num:nums){
            actual_sum+=num;
        }
        return excepted_sum - actual_sum;
    }
}