class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> tempSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(tempSet.contains(nums[i])){
                return nums[i];
            }
            else{
                tempSet.add(nums[i]);
            }
        }

        return -1;
    }
}
