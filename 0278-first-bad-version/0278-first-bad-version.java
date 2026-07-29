/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=0,hi=n,idx=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)==false){
                 // agr good version hai to move right kyuki iss question ka pattern hi aisa hai ki good left pe or bad right pe
                lo=mid+1;

            }
            else{
                //agar bad version hai to mark karo or left jao kya pta ek or bad version left side ho
                idx=mid;
                hi=mid-1;

            }
        }
        return idx;
        
    }
}