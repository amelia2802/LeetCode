class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Approach1: Time complexity O(m+n)
        int i = m-1;    //i starting from the end of the initial elements in nums1 (m-1).
        int j = n-1;    //j starting from the end of nums2 (n-1).
        int k = nums1.length-1;    //k starting from the end of nums1 (nums1.length - 1).

        while(i>=0 && j>=0) {
        if(nums1[i] > nums2[j]) {    //Compares elements from the end of both arrays and places the larger element at the end of nums1, then moves the pointers accordingly.
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];    //Continues until all elements from nums2 are merged into nums1.
        }
        }

            
        while(j>=0) {    //Any remaining elements in nums2 are copied into nums1.
        nums1[k--] = nums2[j--];
        }

        //Approach2: Time complexityO((m + n) log (m + n))
        int j =0;

        for(int i=m;i<nums1.length;i++){
            if(j<nums2.length){    //Copies all elements from nums2 into the tail end of nums1.
                nums1[i] = nums2[j];
            }
            j++;
        }

        Arrays.sort(nums1);    //After copying, the entire array nums1 is sorted using Arrays.sort.
    }
}
