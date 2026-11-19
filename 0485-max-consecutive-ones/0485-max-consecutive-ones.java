class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int tot=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
            max++;
            tot=Math.max(max,tot);
           }
           else{
            
            max=0;
           }
        }
        return tot;
    }
}