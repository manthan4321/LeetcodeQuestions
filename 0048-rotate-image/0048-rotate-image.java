//columns reverse karke then fir transpose kardu!
class Solution {
    public void rotate(int[][] matrix) {
        //step1 column reverse
        int n=matrix.length;
        
        for(int j=0;j<n;j++){
            int up=0,down=n-1;
            while(up<=down){
            int temp=matrix[up][j];
            matrix[up][j]=matrix[down][j];
            matrix[down][j]=temp;
            up++;
            down--;

            }
           
        }
        // now transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        
    }
}