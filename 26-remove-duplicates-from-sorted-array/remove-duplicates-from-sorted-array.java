class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize a pointer 'current' to track the position of the next unique element
        int current = 1;
        
        // Start iterating from the second element since the first element is always unique
        for(int i = 1; i < nums.length; i++) {
            // If the current element is the same as the previous, it's a duplicate
            if(nums[i] == nums[i - 1]) {
                continue; // Skip to the next iteration without doing anything
            }
            // If a new unique element is found, place it at the 'current' index
            nums[current++] = nums[i];
        }
        
        // After processing, 'current' represents the number of unique elements
        return current;
    }
}