class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()==0) return true;
        //to trace horizontal displacement
        int horizontal = 0; 
        //to trace vertical displacement
        int vertical = 0;
        
        //incrementing & decrementing vertical & horizontal based on the character
        for(char c: moves.toCharArray()){
            switch(c){
                case 'U': vertical++;
                    break;
                case 'D': vertical--;
                    break;
                case 'L': horizontal++;
                    break;
                case 'R': horizontal--;
                    break;
            }
        }
        
        return (horizontal==0 && vertical==0);
    }
}
