class Solution {
    public int alternateDigitSum(int n) {
        // iss ques me soln ye hoga ki isme ham normal waise hi krenge jaise pehle krr rhe the index variable bnake fir even odd wli condn se par sare test cases pass nhi krenge kyuki yhn ye follow ho rha hai ki ham lastdigit ke hisaab se chl rhe hai par ye thik nhi hai to pehle reverse kr lenge no ko fir wo same operations krenge
        int temp=n;
        int rev=0;
        while(temp!=0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        temp=rev;
        int index=0;
        int sum=0;
        while(temp!=0){
            int ld=temp%10;
            if(index%2==0){
                sum+=ld;
            }
            else{
                sum-=ld;
            }
            index++;
            temp=temp/10;

        }
        return sum;
        
    }
}