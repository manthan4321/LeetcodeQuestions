class Solution {
    public int isPrefixOfWord(String sentence, String search) {
        String []arr=sentence.split(" ");
        int count=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            String str=arr[i];
            if(str.startsWith(search)){
                count=i+1;
                break;
            }

                   
        }
        if(count==-1) return -1;
        else return count;
        
    }
}