class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0;  // 'current' is a pointer to track the position for the next unique element

        // Iterate through the entire array
        for(int i = 0; i < nums.length; i++) {
            // Check if the current element is part of a triplet or more duplicates
            if(i - 1 >= 0 && i + 1 < nums.length && nums[i - 1] == nums[i] && nums[i] == nums[i + 1]) {
                continue;  // Skip this element if it's a duplicate appearing more than twice
            } else {
                // If it's not part of a triplet, copy the element to the 'current' position
                nums[current++] = nums[i];
            }
        }

        // After processing, 'current' represents the count of elements after removing duplicates
        return current;
    }
}