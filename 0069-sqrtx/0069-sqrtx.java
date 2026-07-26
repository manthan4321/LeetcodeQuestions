class Solution {
    public int mySqrt(int x) {
        // method 2->that is with binary search
        if(x==0) return 0;
        int lo=1,hi=x; // ye koi array nhi jo n-1 pe rkheneg
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid==x/mid) return mid;
            else if(mid<x/mid) lo=mid+1; // ye step issliye kiye hai because of integer overflow error or ye kra  hai ki ek chij idhr multiply thi udhr jaake divide hogyi 
            else hi=mid-1;
        }
        return hi;
        

        
    }
}