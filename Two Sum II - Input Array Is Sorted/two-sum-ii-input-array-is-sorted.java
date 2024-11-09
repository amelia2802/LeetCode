class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length, left=0, right = n-1, mid = 0;
        while(true) {
            int sum = numbers[left]+numbers[right];
            if(sum==target) {
                return new int[]{left+1,right+1};
            }
            mid = (left+right)/2;
            if(sum<target) {
                if(numbers[mid]+numbers[right]<target) {
                    left=mid;
                }
                else {
                    left++;
                }
            }
            else {
                if(numbers[mid]+numbers[left]>target) {
                    right=mid;
                }
                else {
                    right--;
                }
            }
        } 
    }
}
