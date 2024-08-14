class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // Initialize an array 'positions' to track the number of seats and students at each position
        int[] positions = new int[100];  // Assuming the seat and student values range from 1 to 100
        
        // Iterate through the seats array to record the seat positions
        for(int i = 0; i < seats.length; i++) {
            // Decrement the count at the position corresponding to a seat
            positions[seats[i] - 1] -= 1;
        }
        
        // Iterate through the students array to record the student positions
        for(int j = 0; j < students.length; j++) {
            // Increment the count at the position corresponding to a student
            positions[students[j] - 1] += 1;
        }
        
        int count = 0;  // Initialize a counter to track the total number of moves required
        int empty = 0;  // Tracks the cumulative imbalance of seats and students
        
        // Iterate through the 'positions' array to calculate the number of moves
        for(int i = 0; i < 100; i++) {
            if(positions[i] < 0) {
                // If there are more seats than students at this position, add to 'empty'
                empty += positions[i];
            }
            if(positions[i] > 0) {
                // If there are more students than seats at this position, add to 'empty'
                empty += positions[i];
            }
            // Add the absolute value of 'empty' to 'count' to track the number of moves
            count += Math.abs(empty);
        }
        
        // Return the total number of moves required to seat all students
        return count;
    }
}