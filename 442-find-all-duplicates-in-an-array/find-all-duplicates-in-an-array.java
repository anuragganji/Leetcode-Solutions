class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList();
        int current = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                result.add(nums[i]);
            }
        } 
        return result;
    }
}