class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int i=0, j=0;
        while(i<nums.length && j<nums.length){
            while(i<nums.length && nums[i]!=0){
                i++;
            }
            while(j<nums.length && nums[j]==0){
                j++;
            }
            if(i<nums.length && j<nums.length && i<j){
                nums[i] = nums[j];
                nums[j] = 0;
            }
            j++;
        }
        return nums;
        
    }
}