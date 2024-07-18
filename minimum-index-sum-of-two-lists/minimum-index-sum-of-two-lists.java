class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        
        HashMap<String,Integer> map = new HashMap<>();
        int arrayLen = Integer.MAX_VALUE;
        
        ArrayList<String> result = new ArrayList<String>();
        
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        
        for(int j=0;j<list2.length;j++){
                if(map.containsKey(list2[j])){
                    int sum = map.get(list2[j]) + j;
                    if(sum < arrayLen){
                        arrayLen = sum;
                        result.clear();
                        result.add(list2[j]);
                    }
                    else if (arrayLen == sum){
                        result.add(list2[j]);
                    }
                }
        }
        
        return result.toArray(new String[result.size()]);
    }
}