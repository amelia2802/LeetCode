class Solution {
    public int removeElement(int[] nums, int val) {
        int modified_index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[modified_index] = nums[i];
                modified_index++;
            }
        }

        return modified_index;
    }
}
