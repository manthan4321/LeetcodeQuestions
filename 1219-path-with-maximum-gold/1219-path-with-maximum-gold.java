class Solution { 
    
    static int max = 0;

    public static void Maxgold(int row,int col,int [][]grid,
        ArrayList<String> arr,String s,boolean [][]visited){ 
        
        int m=grid.length; 
        int n=grid[0].length; 
        
        if(row>=m || col>=n || row<0 || col<0 || 
           grid[row][col]==0 || visited[row][col]) return; 
        
        visited[row][col]=true;
        
        arr.add(String.valueOf(grid[row][col]));
        
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum += Integer.parseInt(arr.get(i));   // jo pehla path aaya uska sum nikaala fir sidha hi max store kra liya
        } 
        
        max=Math.max(max,sum);
        
        Maxgold(row,col-1,grid,arr,s,visited); //left 
        Maxgold(row,col+1,grid,arr,s,visited); //right 
        Maxgold(row-1,col,grid,arr,s,visited); //up 
        Maxgold(row+1,col,grid,arr,s,visited); //down 
        
        arr.remove(arr.size()-1); 
        visited[row][col]=false; 
    } 
    
    public int getMaximumGold(int[][] grid) { 
        
        ArrayList<String>arr=new ArrayList<>(); 
        
        boolean [][]visited=
            new boolean[grid.length][grid[0].length]; 
        
        max=0;
        
        for(int i=0;i<grid.length;i++){ 
            for(int j=0;j<grid[0].length;j++){ 
                
                if(grid[i][j]!=0){ 
                    Maxgold(i,j,grid,arr,"",visited); 
                } 
            } 
        } 
        
        return max; 
    } 
}