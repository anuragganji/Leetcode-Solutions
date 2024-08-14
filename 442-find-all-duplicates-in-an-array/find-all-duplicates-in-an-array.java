class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList();
        for(int i=0; i<nums.length; i++){
            int current = Math.abs(nums[i]);
            if(nums[current-1]<0){
                result.add(current);
            }else{
                nums[current-1]*=-1;
            }
            
        }
        return result;
    }
}