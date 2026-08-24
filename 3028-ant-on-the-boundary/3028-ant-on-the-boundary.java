class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum==0) count++;
        }
        return count;
        
    }
    // iss question ka meaning ye hai ki ant kitni baar total boundary par aai matlab kitni baar 0th position par aayi to jhn par sum 0 hoga usko count krlo bs
    
}