class Solution {
    public boolean isPalindrome(String s) {
        char tempArr[] = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray(); //convert the input string to character array ommiting spaces,spcl. characters and convert into lowercase

        //take two pointer denoting the indexex
        int start = 0;
        int end = tempArr.length - 1;

        //check starting and ending characters are same or not
        while(start <= end ){
            if(tempArr[start]!=tempArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
