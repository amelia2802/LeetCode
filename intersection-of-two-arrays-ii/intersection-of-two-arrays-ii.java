class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     
        HashMap<Integer,Integer> temp_map = new HashMap<>();
        
        for(int item : nums1){
            temp_map.put(item,temp_map.getOrDefault(item,0)+1);
        }
          
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
         
        for(int num : nums2){
            if(temp_map.containsKey(num) && temp_map.get(num) > 0){
                
                arrayList.add(num);
                temp_map.put(num, temp_map.get(num) - 1);
            }
        }
        
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        
        return result;
    }
}