class Solution {
    public int maxArea(int[] heights) {
        
        int start = 0; //starting bar
        int end = heights.length - 1; //ending bar
        int maxArea = 0;

        while(start < end){
            int area = (end - start) * Math.min(heights[start],heights[end]); //Multiplying the distance(end - start) between the lines by the minimum height (Math.min(heights[start],heights[end])) gives the maximum area of water that can be held between those two lines.
            maxArea = Math.max(maxArea,area);

            if(heights[start] < heights[end]){
                start++;
            }
            else{   //when heights[start] == heights[end] and heights[start] > heights[end]
                end--;
            }
        }

        return maxArea;
    }
}
