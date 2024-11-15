class Solution {
    public boolean isValid(String s) {
        Stack<Character> tempStack = new Stack<>(); //initialize an empty stack
        
        for(int i=0;i<s.length();i++){  //loop through the string
            
            char tempChar = s.charAt(i);
           
            if( tempChar == '(' || tempChar == '{' || tempChar == '[' ){ //if the indexed character of the given string is opening bracket then push it into the stack
                
                tempStack.push(tempChar);
                continue;
            }
            
            else{
                
                //base case
                if (tempStack.isEmpty()) {
                    return false;
                }
                
                //if the indexed character is a closing bracket and the top of the stack was the opening for it then pop
                if (
                    (tempChar == ')' && tempStack.peek() == '(' ) || 
                    (tempChar == '}' && tempStack.peek() == '{' ) || 
                    (tempChar == ']' && tempStack.peek() == '[' ) 
                )
                {
                    tempStack.pop();
                }
                else{   //if not then return false
                    return false;
                }
            }
        }
        
        //if the stack is empty that means we popped all the stack elements so it's a valid parentheses
        return tempStack.isEmpty();
    }
}
