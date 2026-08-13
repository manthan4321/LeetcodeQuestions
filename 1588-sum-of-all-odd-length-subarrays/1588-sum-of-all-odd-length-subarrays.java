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

    //logic ->ar alg alg variable lene hai to condn legegi if i==j wli or agr 
    //odd length subbarrays lene hai to uska logic if (i+j) %2==0 hua to condns lgegi
}