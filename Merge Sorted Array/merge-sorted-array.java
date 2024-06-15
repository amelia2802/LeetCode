class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Time complexity O(m+n)
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(i>=0 && j>=0) {
        if(nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
        }

            
        while(j>=0) {
        nums1[k--] = nums2[j--];
        }

        //Time complexityO((m + n) log (m + n))
        int j =0;

        for(int i=m;i<nums1.length;i++){
            if(j<nums2.length){
                nums1[i] = nums2[j];
            }
            j++;
        }

        Arrays.sort(nums1);
    }
}
