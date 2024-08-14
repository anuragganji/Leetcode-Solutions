class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] positions = new int[100];
        for(int i=0; i<seats.length; i++){
            positions[seats[i]-1] += -1;
        }
        for(int j=0; j<students.length; j++){
            positions[students[j]-1] += 1;
        }
        int count = 0, empty = 0;
        for(int i=0; i<100;i++){
            if(positions[i] < 0){
                empty+=positions[i];
            }
            if(positions[i] > 0){
                empty+=positions[i];
            }
            count += Math.abs(empty)*1; 
        }
        return count;
    }
}