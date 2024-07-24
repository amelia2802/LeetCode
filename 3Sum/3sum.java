class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length - 2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue; //ignore duplicates
            int firstElement = nums[i];
            int start = i+1;
            int end = nums.length - 1;

            while(start<end){
                int secondElement = nums[start];
                int thirdElement = nums[end];

                if(firstElement + secondElement + thirdElement == 0){
                    result.add(Arrays.asList(firstElement,secondElement,thirdElement));
                   
                   while (start < end && nums[start] == secondElement) {
                        start++;
                    }
                    
                    while (start < end && nums[end] == thirdElement) {
                        end--;
                    }
                }

                else if(firstElement + secondElement + thirdElement > 0){
                    end--;
                }
                else{
                    start++;
                }
            }
        }

        return result;
    }
}
