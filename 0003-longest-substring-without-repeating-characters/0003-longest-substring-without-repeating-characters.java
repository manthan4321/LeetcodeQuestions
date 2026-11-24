class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        int i=0,j=0,maxlen=Integer.MIN_VALUE,len=0;
        while(j<n){
            char ch=s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;

            }
            else{
                len=j-i;
                maxlen=Math.max(len,maxlen);
                while(s.charAt(i)!=s.charAt(j)){
                    char chr=s.charAt(i);
                    set.remove(chr);
                    i++;
                }
                i++;
                j++;
            }
        }
        len=j-i;
        maxlen=Math.max(len,maxlen);
        return maxlen;


        
        
    }
}