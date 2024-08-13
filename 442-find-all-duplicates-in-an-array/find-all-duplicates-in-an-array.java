class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet();
        List<Integer> result = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                result.add(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return result;
    }
}