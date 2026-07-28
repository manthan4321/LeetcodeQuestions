class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
                // by binary search logic
        int m=mat.length;
        int n=mat[0].length;
        int lo=0,hi=m*n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int midrow=mid/n;
            int midcol=mid%n;
            if(mat[midrow][midcol]==x) return true;
            else if(mat[midrow][midcol]<x) lo=mid+1;
            else if(mat[midrow][midcol]>x) hi=mid-1;
                
            
        }
        return false;
        
        
    }
}