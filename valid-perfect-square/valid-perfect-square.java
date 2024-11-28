class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        long mid = start + (end -start)/2;
        
        while(start<=end){
            long squareVal = mid * mid;
            
            if(squareVal == num){
                return true;
            }
            else if(squareVal<num){
                start = (int) mid+1;
            }
            else{
                end = (int) mid-1;
            }
            mid = start + (end -start)/2;
        }
        
        return false;
    }
}