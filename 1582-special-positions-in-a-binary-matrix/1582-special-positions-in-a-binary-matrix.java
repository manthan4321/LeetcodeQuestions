class Solution {
    public int numSpecial(int[][] mat) {
        //iss ques ka logic ye hai ki agr hme 1 mil gya to bs merko vo row or vo col check krna hai kya usme koi or 1 to nhi hai 
        // to jaise hi mujhe mila maine row check krli vo ->kaise?
        //row check aise ki ki vo row lock krdi or sirf col ko aage bdhata rha 
        //same goes for col check col lock krdia or row ko aage bdhata rha 
        // or last me agr rowcount or col count dono hi 1 hai to bs milgya ns
        //or ek chij or main mistake jo mai kr rha tha to++ variable hai vo bhr aayega if condn ke 
        
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
                        k++; // ye variable bhr aayega kyuki agr 0 mil jaye array me to aage hi nhi bdhega ye thats why bhr kia
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