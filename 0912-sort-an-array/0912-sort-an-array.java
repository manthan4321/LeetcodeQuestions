class Solution {
    public static void Merge(int []arr1,int []arr2,int []arr){
        int []res=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
                res[k]=arr2[j];
                j++;
                k++;

            }
        }

        while(i<arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }

        for(int x=0;x<res.length;x++){
            arr[x]=res[x];
        }

    }
    public static void MergeSort(int []arr){
        int n=arr.length;
        if(n<=1) return ;
        int index=0;
        int []arr1=new int[n/2];
        int []arr2=new int [n-n/2];

        for(int i=0;i<n/2;i++){
            arr1[i]=arr[index];
            index++;
        }

        for(int i=0;i<n-n/2;i++){
            arr2[i]=arr[index];
            index++;
        }
        

        MergeSort(arr1);
        MergeSort(arr2);

        Merge(arr1,arr2,arr);


    }
    
    public int[] sortArray(int[] nums) {
        MergeSort(nums);
        return nums;
        
    }
}