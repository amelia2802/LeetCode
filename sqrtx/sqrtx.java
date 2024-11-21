class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans=-1;
        int mid = start + (end - start)/2;
        
        while(start<=end){
            long squareR = (long) mid * mid;
            
            if(squareR == x){
                return mid;
            }
            
            else if(squareR > x){
                end=mid-1;
            }
            else{
                ans = mid;
                start=mid+1;
            }
            mid = start + (end - start)/2;
        }
        
        return ans;
    }
}