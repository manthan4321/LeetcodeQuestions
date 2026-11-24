class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int n=s.length();
        
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int []check=new int[256];
            int len=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                int ascii=(int)ch;
                if(check[ascii]==1) break;
                else{
                    len=j-i+1;
                    maxlen=Math.max(len,maxlen);
                    check[ascii]++;
                }


            }
            
        }
        return maxlen;

        
    }
}