class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length==0){
        return 0;
       }

       int unique_elements = 0;

       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[unique_elements]){
            nums[++unique_elements] = nums[i];
        }
       }

       return unique_elements + 1;
    }
}
