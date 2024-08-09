class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, current = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                count++;
            }else{
                nums[current] = nums[i];
                current++;
            }
        }
        return nums.length - count;
    }
}