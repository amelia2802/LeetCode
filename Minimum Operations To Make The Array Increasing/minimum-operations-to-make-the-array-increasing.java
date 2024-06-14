class Solution {
    public int minOperations(int[] nums) {

        if(nums.length<=0){
            return 0;
        }

        int moves = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int increment = nums[i-1] - nums[i] + 1;
                nums[i]+=increment;
                moves+=increment;
            }
        }
 
        return moves;
    }
}
