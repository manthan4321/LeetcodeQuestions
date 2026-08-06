class Solution {
    public double solve(double x, long number) {
        
        if(number<0){
            number=-(number);
            x=1/x;
        }
        if(number==0) return 1;
        double call=solve(x,number/2);
        if(number%2==0) return call*call;
        else return call*call*x;
        
    }
    public double myPow(double x, int n) {
        return solve(x,n);



     }
}