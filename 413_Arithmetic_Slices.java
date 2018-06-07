class Solution {
    public int numberOfArithmeticSlices(int[] a) {
            
        if(a.length < 3)   return 0;
        
        int curdiff = a[1]-a[0];
        int count = 1;
        int slices = 0;
        for(int i=2; i<a.length; i++){
            if(a[i]-a[i-1]==curdiff)    count++;
            else{
                int j = 1;
                while(count>=2){
                    slices+=j;
                    j++;
                    count--;
                }
                count=1;
                curdiff = a[i]-a[i-1];
            }
        }
        
        int j = 1;
        while(count>=2){
            slices+=j;
            j++;
            count--;
        }        
        
        return slices;
    }
}
