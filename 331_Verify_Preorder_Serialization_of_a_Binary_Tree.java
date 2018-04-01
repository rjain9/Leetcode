class Solution {
    
    String[] s;
    int index;
        
    public boolean isValidSerialization(String preorder) {
        //to store all the node values removing commas
        s = preorder.split(",");
        //current node pointer
        index = 0;
        return isValid() && index==s.length;
    }
    
    //a simple dry run would better help you understand the logic.
    //similar to dfs on a binary tree - return false if it fails
    public boolean isValid(){
        
        if(index==s.length)   return false;
        if(s[index].equals("#")){
            index++;
            return true;
        }
        else{
            index++;
            if(index+2>s.length)  return false;
            if(s[index].equals("#") && s[index+1].equals("#")){
                index += 2;
                return true;
            }
            return isValid() && isValid();
        }
    }
}
