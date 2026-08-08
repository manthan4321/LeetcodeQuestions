class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[2*n];
        int m=nums.length;
        int start=0,mid=n; // ye do pointer jo nums pe rhenge or inko alternate daalenge
        int i=0; 
        while(start<n){
            arr[i]=nums[start];
            i++;
            arr[i]=nums[mid];
            i++;
            start++;
            mid++;

        }
        
        return arr;
        
    }
}