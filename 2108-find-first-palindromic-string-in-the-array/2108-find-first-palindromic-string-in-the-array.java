class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        String res2="";
        for(int i=0;i<n;i++){
            String ans=words[i];
            StringBuilder sb=new StringBuilder(ans);
            sb.reverse();
            if(sb.toString().equals(ans)){
                res2+=ans;
                break;
            }
        }
        return res2;
        
    }
}