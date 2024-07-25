class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int firstElement = nums[i];

            for(int j=i+1;j<n-2;j++){
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
                int secondElement = nums[j];
                int start = j+1;
                int end = n-1;

                while(start<end){
                    int thirdElement = nums[start];
                    int fourthElement = nums[end];

                    long sum = (long)firstElement + (long)secondElement + (long)thirdElement + (long)fourthElement;

                    if(sum == target){
                        result.add(Arrays.asList(firstElement , secondElement , thirdElement , fourthElement));
                        
                        while(start<end && nums[start] == thirdElement){
                            start++;
                        }
                        while(start<end && nums[end] == fourthElement){
                            end--;
                        }
                    }
                    else if(sum > target){
                        end--;
                    }
                    else{
                        start++;
                    }
                }
            }
        }

        return result;
    }
}
