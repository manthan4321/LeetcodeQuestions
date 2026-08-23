class Solution {
    public boolean judgeCircle(String moves) {
        int vertical=0;
        int horizontal=0;
        if(moves.length()%2!=0) return false;
        else{
            for(int i=0;i<moves.length();i++){
                if(moves.charAt(i)=='U') horizontal++;
                else if(moves.charAt(i)=='D') horizontal--;
                else if(moves.charAt(i)=='R') vertical++;
                else if(moves.charAt(i)=='L') vertical--;
            }
            
        }
        if(horizontal ==0 && vertical==0) return true;
        else return false;
        
    }
}