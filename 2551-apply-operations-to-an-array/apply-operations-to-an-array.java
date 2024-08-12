class Solution {
    public int[] applyOperations(int[] nums) {
        int current=0;
        for(int i = 0;i<nums.length;i++){
            if(i+1 < nums.length && nums[i] == nums[i+1]){
                nums[i] *=2;
                nums[i+1]=0;
            }
            if(nums[i]!=0){
                int temp = nums[current];
                nums[current++] = nums[i];
                nums[i]= temp;
            }
        }
        return nums;
    }
}