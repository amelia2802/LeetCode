class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2; //to avoid integer overflow used `(end - start)`

        while(start<=end){
            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] > target){
                end--;
            }
            else{
                start++;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
}