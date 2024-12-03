class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder modifiedStr = new StringBuilder();
        int i=0;
        int j=0;

        while(i<s.length()){
            if(j<spaces.length && i==spaces[j]){
                modifiedStr.append(" ");
                j++;
            }
            modifiedStr.append(s.charAt(i));
            i++;
        }

        return modifiedStr.toString();
    }
}
