class Solution {
    public int[] twoSum(int[] nums, int target) {

        //initialize an empty map to store the values
        HashMap<Integer,Integer> tempMap = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            //find the second number by target - nums[i] 
            int secondNum = target - nums[i];

            //check if the second number presents in the map and return the indexes of both
            if(tempMap.containsKey(secondNum)){
                return new int[]{tempMap.get(secondNum),i};
            }

            //add the current array element to the map
            tempMap.put(nums[i],i);
        }

        return new int[]{};
    }
}
