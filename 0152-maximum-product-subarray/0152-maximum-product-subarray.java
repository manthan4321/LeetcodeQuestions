class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int prefix=1;
        int suffix=1;
        int n=nums.length;
        int leftmax=Integer.MIN_VALUE;
        int rightmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;;
            prefix=prefix*nums[i];
            leftmax=Math.max(leftmax,prefix);
        }
        for(int i=n-1;i>=0;i--){
            if(suffix==0) suffix=1;;
            suffix=suffix*nums[i];
            rightmax=Math.max(rightmax,suffix);
        }
        return Math.max(leftmax,rightmax);


        
    }
}