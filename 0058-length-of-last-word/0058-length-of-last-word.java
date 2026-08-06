class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int index=-1;
        int maxindex=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                index=i;

            }
            if(index>maxindex){
                maxindex=index;
            }
        }
        int count=0;
        for(int i=maxindex+1;i<n;i++){
            count++;

        }
        return count;

        
    }
}