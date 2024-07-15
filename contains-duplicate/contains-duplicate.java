class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> compared_set = new HashSet<Integer>();
        
        for(int item : nums){
            if(compared_set.contains(item)){
                return true;
            }
            
            compared_set.add(item);
        }
        
        return false;
    }
}