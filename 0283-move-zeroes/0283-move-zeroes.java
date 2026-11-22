class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int noz=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) noz++;
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            
        }
        while(noz>0){
            nums[index]=0;
            noz--;
            index++;
        }
        
    }
}