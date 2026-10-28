class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int x:nums){
              sum+=x;
        }
        int k=(nums.length)*(nums.length+1)/2;
        return k-sum;
    }
}