class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> temp_set = new HashSet<Integer>();
        HashSet<Integer> final_set = new HashSet<Integer>();
        
        for(int item : nums1){
            temp_set.add(item);
        }
        
        for(int item : nums2){
            if(temp_set.contains(item)){
                final_set.add(item);
            }
        }
        
        int[] result_arr = new int[final_set.size()];
        int i = 0;
        
        for(int item : final_set){
            result_arr[i++] = item;
        }
             
        return result_arr;
    }
}