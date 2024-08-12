class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, current = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[current] = nums[i];
                current++;
            }
        }
        return current;
    }
}