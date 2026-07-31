class Solution {
    public int countSymmetricIntegers(int low, int high) {
        // Method 2 with string
        int count=0; 
        for(int i=low;i<=high;i++){
            String s=Integer.toString(i);
            if(s.length()%2!=0){
                continue;
            }
            else{
                int mid=s.length()/2;
                int sum1=0;
                for(int j=0;j<mid;j++){
                    sum1+=s.charAt(j)-'0';// isse har char ki int value mil jati hai
                }
                int sum2=0;
                for(int k=mid;k<s.length();k++){
                    sum2+=s.charAt(k)-'0';

                }
                if(sum1==sum2){
                    count++;
                }
            }
        }
        return count;

    }
}