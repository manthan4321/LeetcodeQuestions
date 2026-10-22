class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>arr=new ArrayList<>();
        int max=-1;
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(extraCandies+candies[i]>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;

    }
}