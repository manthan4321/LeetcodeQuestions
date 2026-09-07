class Solution { 
    static int count=0; 

    public static void Check(int row,int col,int val,int [][]grid){ 
        int n=grid.length; 

        if(row>=n || col>=n || row<0 || col<0) return; 
        
        if(grid[row][col]!=val) return;

        if(grid[row][col]==n*n-1) { 
            count++; 
            return; 
        } 
        
        Check(row+2, col+1, val+1, grid); 
        Check(row+2, col-1, val+1, grid); 
 
        Check(row-2, col+1, val+1, grid); 
        Check(row-2, col-1, val+1, grid); 
 
        Check(row+1, col+2, val+1, grid); 
        Check(row+1, col-2, val+1, grid); 
 
        Check(row-1, col+2, val+1, grid); 
        Check(row-1, col-2, val+1, grid); 
    } 
 
    public boolean checkValidGrid(int[][] grid) { 
        count=0; 
        int m=grid.length; 
        Check(0,0,0,grid); 
        
        if(count==0) return false; 
        else return true; 
    } 
}