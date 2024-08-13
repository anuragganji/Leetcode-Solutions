class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> resultSet = new HashSet();
        List<Integer> result = new ArrayList();
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length;i++){
            if(set.contains(nums[i])){
                resultSet.add(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        for(int i:resultSet){
            result.add(i);
        }
        return result;
    }
}