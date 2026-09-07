class Solution {
    public static int sumofdigits(int num){
        int sum=0;
        int temp=num;
        while(temp!=0){
            int lastdigit=temp%10;
            sum+=lastdigit;
            temp=temp/10;

        }
        return sum;
    }
    public int minElement(int[] nums) {
        int []arr=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr[i]=sumofdigits(nums[i]);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                
            }

        }
        return min;
        
    }
}