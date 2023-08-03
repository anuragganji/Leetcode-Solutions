class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i =0; i<nums.length; i++){
            int solution = target - nums[i];
            if(map.containsKey(solution)){
                return new int[]{map.get(solution), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}