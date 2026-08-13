class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i];
                }
                else if((i+j)%2==0 ){
                    int sum1=0;
                    for(int x=i;x<=j;x++){
                        sum1+=arr[x];
                        
                    }
                    sum+=sum1;
                }
            }
        }
        return sum;

        
    }
}