class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int squaresum=0;
        int temp=n;
        while(temp!=0){
            int lastdigit=temp%10;
            digitsum+=lastdigit;
            squaresum+=lastdigit*lastdigit;
            temp=temp/10;
        }
        if(squaresum-digitsum>=50) return true;
        else return false;
    }
}