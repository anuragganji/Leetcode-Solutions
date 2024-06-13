class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // Sort the seats and students arrays to pair the closest available seat with each student
        Arrays.sort(seats);
        Arrays.sort(students);
        // Initialize the variable to keep track of the total moves required
        int count = 0;
        for(int i = 0; i<seats.length; i++){
            //Calculate the distance between the i-th seat and the i-th student
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }
}