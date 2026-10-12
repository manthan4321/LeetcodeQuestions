class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []left =new int[n];
        left[0]=0;
        int index=1;
        int sum=0;
        int sum2=0;
        int []right=new int[n];
        right[n-1]=0;
        for(int i=0;i<n-1;i++){
            sum+=nums[i];
            left[index++]=sum;
        }
        int idx=n-2;
        for(int i=n-1;i>=1;i--){
            sum2+=nums[i];
            right[idx--]=sum2;
        }
        int []res=new int [n];
        int lo=0;
        int hi=0;
        int id=0;
        while(lo<left.length && hi<right.length){
            res[id]=Math.abs(left[id]-right[id]);
            id++;
            lo++;
            hi++;
        }
        return res;
        
    }
}