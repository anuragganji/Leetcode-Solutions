class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize a pointer 'current' to track the position of the next unique element
        int current = 1;

        // Start iterating from the second element since the first element is always unique
        for(int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the previous one, it's a unique element
            if(nums[i] != nums[i - 1]) {
                // Place the unique element at the 'current' index
                nums[current++] = nums[i];
            }
        }

        // After processing, 'current' represents the number of unique elements
        return current;
    }
}