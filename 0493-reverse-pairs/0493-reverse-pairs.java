class Solution {

    // isme or inversion count me sirf 2 chij ka difference hai ki isme inversion count ka alg function banana hai or usse merge se pehle call krna hai
     static int count; // ye global variable hai kyuki hme ye merge me bhi chahiye or or inversion count me bhi chahiye

   public static void InversionCount(int []arr1,int[]arr2){
    int i=0,j=0;
    while(i<arr1.length && j<arr2.length){
        if(((long)arr1[i])>2*((long)arr2[j])){
            count+=(arr1.length-i);
            j++;

        }
        else{
            i++;
        }
    }
   } 
   public static void Merge(int[]arr1,int []arr2,int []arr){
       int i=0,j=0,k=0;
       int n=arr.length;
       int []res=new int[arr1.length+arr2.length];
       while(i<arr1.length && j<arr2.length){
           if(arr1[i]<=arr2[j]){
               res[k]=arr1[i];
               k++;
               i++;
           }
           else{
               res[k]=arr2[j];
               k++;
               j++;
           }
       }
       while(i<arr1.length){
           res[k]=arr1[i];
           i++;
           k++;
       }
       while(j<arr2.length){
           res[k]=arr2[j];
           k++;
           j++;
       }
       for(int x=0;x<n;x++){
           arr[x]=res[x];
       }
   }
   
   
    public static void MergeSort(int []arr){
        int n=arr.length;
        if(n<=1) return;
        int []arr1=new int[n/2];
        int []arr2=new int[n-n/2];
        int index=0;
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[index];
            index++;
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[index];
            index++;
        }
        MergeSort(arr1);
        MergeSort(arr2);
        InversionCount(arr1,arr2);
        
        Merge(arr1,arr2,arr);
        
        
        
        
        
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        count=0;
        MergeSort(nums);
        return count;
        
    }
}                                                                                                                                                                                                                                                                                                       