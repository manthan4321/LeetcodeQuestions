class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int minr=0,minc=0,maxr=m-1,maxc=n-1;
        while(minr<=maxr && minc<=maxc){
            //right
            for(int j=minc;j<=maxc;j++){
                res.add(matrix[minr][j]);
            }
            minr++;

            //down 
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                res.add(matrix[i][maxc]);
            }
            maxc--;

            //left 
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                res.add(matrix[maxr][j]);
            };
            maxr--;

            //up
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                res.add(matrix[i][minc]);
            }
            minc++;


        }
        return res;
        
    }
}