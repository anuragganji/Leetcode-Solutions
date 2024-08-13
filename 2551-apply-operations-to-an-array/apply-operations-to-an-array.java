class Solution {
    public int[] applyOperations(int[] nums) {
        int current = 0; // 'current' keeps track of the position to place the next non-zero element
        
        // Iterate through the array
        for(int i = 0; i < nums.length; i++) {
            // Check if the current element and the next element are the same
            if(i + 1 < nums.length && nums[i] == nums[i + 1]) {
                // If they are the same, double the current element and set the next element to 0
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            
            // If the current element is non-zero, it needs to be moved forward
            if(nums[i] != 0) {
                // Swap the current non-zero element with the element at 'current' position
                int temp = nums[current];
                nums[current++] = nums[i];
                nums[i] = temp;
            }
        }
        
        // Return the modified array after all operations
        return nums;
    }
}