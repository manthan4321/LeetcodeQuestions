class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int temp=x;
        int reverse=0;
        int lastdigit=0;
        if(x<0) return false;
        while(temp!=0){
            lastdigit=temp%10;
            reverse=reverse*10+lastdigit;
            temp=temp/10;
        }
        if(reverse==x){
            return true;
        }
        else{
            return false;

        }
        
        
        
    }
}