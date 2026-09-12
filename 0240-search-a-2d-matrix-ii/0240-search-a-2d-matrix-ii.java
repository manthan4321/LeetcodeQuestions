class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int m=mat.length;
        int n=mat[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(mat[i][j]==x) return true;
            else if(mat[i][j]>x) j--;
            else if(mat[i][j]<x) i++;
        }
        return false;
        
    }
}