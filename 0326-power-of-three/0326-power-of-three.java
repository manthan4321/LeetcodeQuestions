class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return  true;     // order of recursion->sbse pehle base case fir aayenge sare cases
        if(n%3!=0) return false;
        if(n<=0) return false;
        return isPowerOfThree(n/3);
       


        
        
        
    }
}