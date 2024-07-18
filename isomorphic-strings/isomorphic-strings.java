class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> temp_map = new HashMap<>();
        HashMap<Character,Character> temp_map2 = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(temp_map.containsKey(c1)){
                if(temp_map.get(c1)!=c2){
                    return false;
                }
            }
            else{
                temp_map.put(c1,c2);
            }
            
            if(temp_map2.containsKey(c2)){
                if(temp_map2.get(c2)!=c1){
                    return false;
                }
            }
            else{
                temp_map2.put(c2,c1);
            }
        }
        
        return true;
    }
}