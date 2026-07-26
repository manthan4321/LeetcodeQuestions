class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int temp=n;
        while(temp!=0){
            int lastdigit=temp%10;
            product*=lastdigit;
            temp=temp/10;

        }
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n=n/10;

        }
        return product-sum;
    }
}