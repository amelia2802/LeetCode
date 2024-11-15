class Solution {
    public boolean isValid(String s) {
        
        s.replaceAll("\\s","");
        
        Stack<Character> tempStack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char tempChar = s.charAt(i);
           
            if( tempChar == '(' || tempChar == '{' || tempChar == '[' ){
                
                tempStack.push(tempChar);
                continue;
            }
            
            else{
                
                if (tempStack.isEmpty()) {
                    return false;
                }
                
                if (
                    (tempChar == ')' && tempStack.peek() == '(' ) || 
                    (tempChar == '}' && tempStack.peek() == '{' ) || 
                    (tempChar == ']' && tempStack.peek() == '[' ) 
                )
                {
                    tempStack.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        return tempStack.isEmpty();
    }
}