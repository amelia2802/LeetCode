class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;   //no. of rows in the matrix
        int cols = matrix[0].length;    //no. of colums in the matrix

        /* flatten the 2d array to 1d array*/
        int start = 0;  //starting index of 1d array
        int end = rows * cols - 1;  //ending index of 1d array
        int mid = start + (end - start)/2; //mid index

        while(start<=end){
            /*map the 1D index mid from the flattened array back to the 2D matrix row and column indices*/
            int row = mid/cols;
            int col = mid % cols;
            if(target > matrix[row][col]){
                start = mid + 1;
            }
            else if(target < matrix[row][col]){
                end = mid - 1;
            }
            else{
               return true;
            }
            mid = start + (end - start)/2;
        }
        return false;
    }
}
