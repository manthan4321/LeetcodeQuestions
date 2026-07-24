class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==1){
            return new int[]{nums[0]};
        }
        else{
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(nums[j]%2!=0){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
            return nums;
        }
        
    }
}