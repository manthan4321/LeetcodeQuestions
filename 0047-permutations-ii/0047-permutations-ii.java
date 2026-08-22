class Solution {

    public static void Permutations(int[] nums, List<Integer> arr,
    List<List<Integer>> res, boolean[] used) {

        if (arr.size() == nums.length) {
           ArrayList<Integer>temp=new ArrayList<>(arr);
           if(res.contains(temp)){
                
                return;
            
           }
           res.add(temp);
           return;
        }

        for (int i = 0; i < nums.length; i++) {

            // index already used hai
            if (used[i]) {
                continue;
            }

            used[i] = true;
            arr.add(nums[i]);

            Permutations(nums, arr, res, used);

            arr.remove(arr.size() - 1);
            used[i] = false; // for ans mne isse false kara hai
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        Permutations(nums, arr, res, used);

        return res;
    }
}