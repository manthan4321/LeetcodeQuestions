class Solution {
    public String reversePrefix(String s, int k) {
        String res1="";
        String res2="";
        String res3="";
        for(int i=0;i<k;i++){
            res1+=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder(res1);
        sb.reverse();
        res2+=sb;
        

        res3+=res2+s.substring(k);
        return res3;


        

        
    }
}