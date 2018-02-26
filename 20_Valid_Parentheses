class Solution {
    public boolean isValid(String s) {
        
        //if odd length return false
        if(s.length()%2!=0) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case '(': stack.push(')');
                    break;
                case '{': stack.push('}');
                    break;
                case '[': stack.push(']');
                    break;
                case ')': if(stack.isEmpty() || stack.pop()!=')')   return false;
                    break;
                case '}': if(stack.isEmpty() || stack.pop()!='}')   return false;
                    break;
                case ']': if(stack.isEmpty() || stack.pop()!=']')   return false;
                    break;
            }
        }
        
        //if empty then true else false;
        return stack.isEmpty();
    }
}
