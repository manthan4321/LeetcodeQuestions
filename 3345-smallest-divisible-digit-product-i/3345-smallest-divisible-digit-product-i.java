class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        int product=1;

        while(temp!=0){
            int lastdigit=temp%10;
            product*=lastdigit;
            temp=temp/10;
        }
        if(product%t==0 && product<=n){
            return n;
        }
        else{

            
            for(int i=1;i<10;i++){
                int number=n+i;
                int temp2=number;
                int product2=1;
                while(number!=0){
                int lastdigit=number%10;
                product2*=lastdigit;
                number=number/10;

                }
                if(product2%t==0 && product2<=temp2){
                    return temp2;
                }

                
            }
            
        }
        return -1;
        
    }
}