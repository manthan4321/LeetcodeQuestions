class Solution {
    public static boolean QueenPlaced(int row,int col,char[][]board){
        // column check
        int n=board.length;
        int i=row-1;
        while(i>=0){
            if(board[i][col]=='Q') return false;
            i--;
        }
        

        // left diagonal
        i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        // right diagonal
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
    
    
    public static void Nqueens(int n,char[][]board,List<List<String>>res,int row){
        int x=board.length;
        if(row==n){
            ArrayList<String>temp=new ArrayList<>();
            for(int i=0;i<x;i++){
                temp.add(new String(board[i]));

            }
            res.add(temp);
            return;
        }
        for(int col=0;col<x;col++){
            if(QueenPlaced(row,col,board)){
                board[row][col]='Q';
                Nqueens(n,board,res,row+1);
                board[row][col]='.';

            }
        }


    }
    
    
    public int totalNQueens(int n) {
        List<List<String>>res=new ArrayList<>();
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        Nqueens(n,board,res,0);
        return res.size();
        
    }
}