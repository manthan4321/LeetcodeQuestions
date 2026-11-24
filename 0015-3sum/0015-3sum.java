class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j = i + 1; j < nums.length; j++) {

                int req = -(nums[i] + nums[j]);

                if(map.containsKey(req)) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(req);
                    temp.add(nums[j]);

                    Collections.sort(temp);

                    if(!set.contains(temp)) {
                        set.add(temp);
                        res.add(temp);
                    }
                }

                map.put(nums[j], j);
            }
        }

        return res;
    }
}