class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      // iska logic-->pehle first occurnce nikaallo ,fir last occurence ,fir uske baad first se last tak loop chalao or arraylist me sare index store karado

        int n=nums.length;
        ArrayList<Integer>res=new ArrayList<>();
        Arrays.sort(nums);
        int lo=0,hi=n-1,first=-1;
        // first occurence
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]>target) hi=mid-1;
            else{
                first=mid;
                hi=mid-1;

            }

        }
        // now last occurence
        int low=0,high=n-1,last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
            else{
                last=mid;
                low=mid+1;

            }

        }
        // now loop from first occurence to last occurence
        // uspe pehle ek checkmark jisse hme pta lgega ki agr element mila hi nhi to empty list return karao or wo aise ki hmne first ko -1 dia tha to hm aise krenge ab
        if(first==-1){
            return res;
        }
        else{
            for(int i=first;i<=last;i++){
            res.add(i);

        }
        return res;

        }
       
        
    }
}