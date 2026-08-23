class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int ascii=(122-(int)(ch))+1;
            int product=(i+1)*ascii;
            sum+=product;

        }
        return sum;
        
    }
}