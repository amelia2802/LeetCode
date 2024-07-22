class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> temp_map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] temp_char = strs[i].toCharArray();
            Arrays.sort(temp_char);
            
            String mod_str = new String(temp_char);
            
            if(!temp_map.containsKey(mod_str)){
                temp_map.put(mod_str,new ArrayList<>());
            }
            
            temp_map.get(mod_str).add(strs[i]);
            
        }
        
        return new ArrayList<>(temp_map.values());
    }
}