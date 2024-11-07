class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0; //initialize maximum length
        HashSet<Character> tempSet = new HashSet<>(); //initialize empty set
        int left = 0;   //intiailize left index

        for(int i=0;i<s.length();i++){ //loop through the string from right index; left=right=0

            while(tempSet.contains(s.charAt(i))){ //check if set contains the character of right index
                tempSet.remove(s.charAt(left)); //remove the left index character to slide the window
                left++;//slide the window
            }

            tempSet.add(s.charAt(i)); //add the right character
            maxLen = Math.max(maxLen,i-left+1); //check the maximum length
        }

        return maxLen;
    }
}
