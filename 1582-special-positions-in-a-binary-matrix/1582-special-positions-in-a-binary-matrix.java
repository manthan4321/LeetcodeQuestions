class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    int rowcount=0;
                    int row=i;
                    int k=0;
                    while(k<n){
                        if(mat[row][k]==1) {
                            rowcount++;
                            
                        }
                        k++;
                    }
                    int col=j;
                    int l=0;
                    int colcount=0;
                    while(l<m){
                        if(mat[l][col]==1){
                            colcount++;
                            
                        }
                        l++;
                    }
                    if(rowcount==1 && colcount==1){
                        count++;
                        
                    }
                }
            }
        }
        return count;
        
    }
}