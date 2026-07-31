class Solution {
    public int countSymmetricIntegers(int low, int high) {
        //  logic of this question->no is symmetric when first half ka sum==last half ka sum
        //i.e 1203 pehle half ka sum 1+2 == 0+3
        // to hme kuch aisa krna pdega ki jisse mai jaise hi loop ke through no pr aau usko do half me to du  fir ag sum equal hai to count return karadu
        // ab main logic agr no hai 1203 jab mai last digit nikalta tha to % 10 karta tha par agr meerko last 2 digits nikalni hai to 100 se devide krna pdega to ab agr mai power function ka use kr lu to kaam ho jayega
        //pow=10^no of digits/2 or iss se hi kaam ho jayega aise ki agar me % use karunga to last 2 aajenge par agr mai/ pow lgadunga to starting ke 2 aajenge 
       //step 1 count no of digits
        int count=0;
        for(int i=low;i<=high;i++){
            int num=i;
            int digits=0;
            while(num!=0){
                digits++;
                num=num/10;

            }
            if(digits%2!=0){
                continue;
            }
            else{
            int half=digits/2;
            int pow=1;
            for(int k=1;k<=half;k++){
                pow*=10;
            }

            int leftpart=i/pow;
            int sum1=0;
            while(leftpart!=0){
                sum1+=leftpart%10;
                leftpart/=10;
            }
            int rightpart=i%pow;
            int sum2=0;
            while(rightpart!=0){
                sum2+=rightpart%10;
                rightpart/=10;
            }
            if(sum1==sum2){
                count++;
            }

        }

            }
            return count;
            
        
    }
}