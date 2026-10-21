class Solution {
    public String reverseWords(String s) {
        String []arr=s.trim().split(" +");
        String ans="";
        int n=arr.length;
        for(int i=0;i<n;i++){
            String f=arr[i];
            StringBuilder sb=new StringBuilder(f);
            sb.reverse();
            String pure=sb.toString();
            ans+=pure;
            if(i!=n-1){
                ans+=" ";
            }



        }
        return ans;

        
    }
}