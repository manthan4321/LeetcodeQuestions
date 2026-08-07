class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int m=startTime.length;
        int n=endTime.length;
        int count=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime ){
                count++;
                
            }
            i++;
            j++;
        }
        return count;
        
       
    }
}