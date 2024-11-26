class Solution {
    public int firstOcc(int[] nums, int target) {
        int s = 0, e = nums.length-1;
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e) {

            if(nums[mid] == target){
                ans = mid;
                e = mid - 1;
            }
            else if(target > nums[mid]) {
                s = mid + 1;
            }
            else if(target < nums[mid]) {
                e = mid - 1;
            }

            mid = s + (e-s)/2;
        }
        return ans;
    }
    
    public int lastOcc(int[] nums, int target) {
        int s = 0, e = nums.length-1;
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e) {

            if(nums[mid] == target){
                ans = mid;
                s = mid + 1;
            }
            else if(target > nums[mid]) {
                s = mid + 1;
            }
            else if(target < nums[mid]) {
                e = mid - 1;
            }

            mid = s + (e-s)/2;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a = firstOcc(nums,target);
        int b = lastOcc(nums,target);
        int result[] = {a,b};
        return result;
    }
}