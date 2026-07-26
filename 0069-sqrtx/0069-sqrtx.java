class Solution {
    public int mySqrt(int x) {
        // method 1->brute force
        
        long root=0;
        for(long i=0;i<=x;i++){
            if(i*i>x) break;
            root=i;
        }
        return (int)root;
        
    }
}