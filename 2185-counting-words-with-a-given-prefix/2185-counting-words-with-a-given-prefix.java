class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            String str=words[i];
            if(str.startsWith(pref)){
                count++;
            }
        }
        return count;
        
    }
}