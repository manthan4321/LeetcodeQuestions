class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        // soln is easy but we need to remember only one thing jaise hi hame discout mil jaye to prices j-prices i to kr denge par break bhi lgayenege kyuki wrna j wli loop aage traverse krti rhegi or example if i pe 8 hai j pe 4 hai to pehle to dicount lg jayega par break na hone ki wjh se fir vo 6 pe jayega thats why break lgega or jaise hi j bda hoga i se to j apne aap aage bdh jayega
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
        
    }
}