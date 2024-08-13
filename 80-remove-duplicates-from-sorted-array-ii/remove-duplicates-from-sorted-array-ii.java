class Solution {
    public int removeDuplicates(int[] nums) {
        int current =0;
        for(int i=0;i<nums.length;i++){
            if(i-1>=0 && i+1<nums.length && nums[i-1] == nums[i] && nums[i] == nums[i+1]){
                continue;
            }else{
                nums[current++] = nums[i];
            }
        }
        return current;
    }
}