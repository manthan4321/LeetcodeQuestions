class Solution {
    public static void generate(int left,int right,String s,int n,List<String>result){
        if(right==n){   // ye step issliye kyuki last step me sirf right bracket hi fill hore the to thats why jaise hi r==n ho jayega sara kaam complete ho jayega
        result.add(s);
        return;
        }

        if(left<n) generate(left+1,right,s+"(",n,result);
        if(right<left) generate(left,right+1,s+")",n,result);
    }
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generate(0,0,"",n,result);
        return result;
        
    }
}