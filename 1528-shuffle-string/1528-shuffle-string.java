class Solution {
    public String restoreString(String s, int[] indices) {
        char [] str=new char[indices.length];
        String res="";
       
        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
        }

        for(int i=0;i<str.length;i++){
            res+=str[i];
        }
        return res;

    }
}