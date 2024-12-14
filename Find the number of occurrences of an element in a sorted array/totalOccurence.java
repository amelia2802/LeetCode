public class totalOccurence{
    public static int firstOcc(int[] nums, int target) {
        int s = 0, e = nums.length - 1; 
        int mid = s + (e - s) / 2;      
        int ans = -1;                 
        
        while (s <= e) {
            if (nums[mid] == target) { 
                ans = mid;            
                e = mid - 1;          
            } else if (target > nums[mid]) { 
                s = mid + 1;         
            } else { 
                e = mid - 1;          
            }
            mid = s + (e - s) / 2;    
        }
        return ans;                   
    }

    public static int lastOcc(int[] nums, int target) {
        int s = 0, e = nums.length - 1; 
        int mid = s + (e - s) / 2;      
        int ans = -1;                 
        
        while (s <= e) {
            if (nums[mid] == target) { 
                ans = mid;            
                s = mid + 1;          
            } else if (target > nums[mid]) {
                s = mid + 1;          
            } else {
                e = mid - 1;         
            }
            mid = s + (e - s) / 2;    
        }
        return ans;
    }

    public static int findTotalOccurence(int[] nums, int target) {
        int startIndex = firstOcc(nums, target); 
        int endIndex = lastOcc(nums, target);  

        if(startIndex==-1 && endIndex==-1){
            return 0;
        }
        
        int totalOccurence = (endIndex - startIndex) + 1;          
        return totalOccurence;                  
    }

    public static void main(String[] args){
        int[] arr = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target = 6;
        System.out.println(findTotalOccurence(arr,target));
    }
}
