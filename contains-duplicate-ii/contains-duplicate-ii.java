class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> check_map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(check_map.containsKey(nums[i])){
                
                int prevIndex = check_map.get(nums[i]);
                
                if(i - prevIndex <=k){
                    return true;
                }
            }
            check_map.put(nums[i],i);
        }
        
        return false;
    }
}