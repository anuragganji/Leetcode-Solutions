class Solution {
    public int[] applyOperations(int[] nums) {
        // First pass: Combine adjacent equal numbers and set the second number to 0
        for(int i = 0; i < nums.length - 1; i++) {
            // Check if the current number is equal to the next one
            if(nums[i] == nums[i+1]) {
                // Double the current number and set the next one to 0
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        // Second pass: Move all non-zero numbers to the front, preserving order
        int i = 0, j = 0;
        while(i < nums.length && j < nums.length) {
            // Find the next 0 in the array
            while(i < nums.length && nums[i] != 0) {
                i++;
            }
            // Find the next non-zero number after the last found zero
            while(j < nums.length && nums[j] == 0) {
                j++;
            }
            // If a 0 is found before a non-zero number, swap them
            if(i < nums.length && j < nums.length && i < j) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
            j++;  // Move the second pointer forward
        }

        // Return the modified array
        return nums;
    }
}