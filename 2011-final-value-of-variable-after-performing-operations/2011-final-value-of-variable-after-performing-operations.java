class Solution {
    public int finalValueAfterOperations(String[] o) {
        // thing to remember in kbhi bhi agr string ko compare krwana ho toh == nhi .equals lgta hai
        int n=o.length;
        int X=0;
        for(int i=0;i<n;i++){
            if(o[i].equals("--X") || o[i].equals("X--")){
                X-=1;
            }
            else {
                X+=1;
            }
        }
        return X;

        
    }
}