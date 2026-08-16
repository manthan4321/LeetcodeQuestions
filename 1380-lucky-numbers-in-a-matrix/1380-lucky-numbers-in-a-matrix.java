class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int min=matrix[i][j];
                int max=matrix[i][j];
                int row=i;
                int col=j;
                int k=0;
                int l=0;
                while(k<n){
                    if(min>matrix[row][k]){
                        min=matrix[row][k];
                    }
                    k++;

                }
                while(l<m){
                    if(max<matrix[l][col]){
                        max=matrix[l][col];
                    }
                    l++;
                }
                if(matrix[i][j]==min && matrix[i][j]==max){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
        
    }
}