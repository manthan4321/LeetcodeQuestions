class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String str="";
        int index=0;
        while(i<word1.length() && j<word2.length()){
            str+=word1.charAt(i);
            i++;
            str+=word2.charAt(j);
            j++;
        }
        if(i==word1.length()){
            while(j<word2.length()){
                str+=word2.charAt(j);
                j++;
            }
        }
        if(j==word2.length()){
            while(i<word1.length()){
                str+=word1.charAt(i);
                i++;
            }
        }
        return str;
       
        
    }
}