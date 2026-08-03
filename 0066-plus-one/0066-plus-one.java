class Solution {
    public int[] plusOne(int[] digits) {

        int n=digits.length;
        int carry=1;
        int []res=new int[n];
        for(int i=n-1;i>=0;i--){
            if(carry+digits[i]<=9){
                res[i]=digits[i]+carry;
                carry=0;
            }
            else{
                res[i]=0;
                carry=1;
            }

            

        }
        if(carry==1){
            int[] ans=new int[n+1];
            ans[0]+=1;
            return ans;
        }
        return res;
       
        
    }
}