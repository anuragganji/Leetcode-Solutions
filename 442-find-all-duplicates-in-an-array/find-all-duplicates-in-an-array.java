class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Initialize a list to store the duplicate elements
        List<Integer> result = new ArrayList<>();
        
        // Iterate through each element in the array
        for(int i = 0; i < nums.length; i++) {
            // Get the absolute value of the current element
            int current = Math.abs(nums[i]);
            
            // Check if the element at index 'current - 1' is negative
            if(nums[current - 1] < 0) {
                // If it's negative, it means we have encountered this number before, so it's a duplicate
                result.add(current); // Add the duplicate number to the result list
            } else {
                // Otherwise, mark this number as encountered by making the element at 'current - 1' negative
                nums[current - 1] *= -1;
            }
        }
        
        // Return the list of duplicates found in the array
        return result;
    }
}