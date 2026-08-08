class Solution {
    public int[] concatWithReverse(int[] nums) {
        
        int n=nums.length;
        if(n==1) return new int[]{nums[0],nums[0]};

        int []res=new int [2*n];
        int index=0;
        for(int i=0;i<n;i++){
            res[index++]=nums[i];

        }
        // reversing the array
        int start=0,end=n-1;
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

        for(int i=0;i<n;i++){
            res[index++]=nums[i];
        }
        return res;
        

        
        
    }
}