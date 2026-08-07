class Solution {

    public void reversepart(int i,int j,int []arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

 


    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reversepart(n-k,n-1,nums);
        reversepart(0,n-k-1,nums);
        reversepart(0,n-1,nums);

        
    }
}