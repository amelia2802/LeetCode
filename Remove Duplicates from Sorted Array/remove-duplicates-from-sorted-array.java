class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length==0){
        return 0;
       }

       int unique_elements = 0;

       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[unique_elements]){
            nums[++unique_elements] = nums[i]; //ensures that unique_elements always points to the last unique element found and the next unique element is placed correctly in the array.
        }
       }

       return unique_elements + 1;
    }
}

/*By the end of the loop, unique_elements will point to the index of the last unique element found. If unique_elements is 4, it means there are 5 unique elements (indices 0 through 4). Thus, unique_elements + 1 gives us the count of unique elements.

Final State:
unique_elements = 4
Array: [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
Returning unique_elements + 1 yields 5, which is the correct number of unique elements.*/
