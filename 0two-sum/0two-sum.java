class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> temp_map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int secondNum = target - nums[i];
            
            if(temp_map.containsKey(secondNum)){
                return new int[]{temp_map.get(secondNum),i};
            }
            
            temp_map.put(nums[i],i);
            
        }
        
        return new int[] {};
    }
}