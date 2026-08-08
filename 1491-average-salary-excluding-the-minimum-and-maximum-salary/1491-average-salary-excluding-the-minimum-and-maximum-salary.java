class Solution {
    public double average(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double avg=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        for(int i=0;i<n;i++){
            if(arr[i]!=max && arr[i]!=min){
                avg+=arr[i];
                count++;
            }
        }
        return avg/count;
        
    }
}