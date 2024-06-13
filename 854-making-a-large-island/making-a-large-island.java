class Solution {
    // HashMap to store the size of each island identified by their unique ID
    private static HashMap<Integer,Integer> islandCounts = new HashMap();

    // DFS function to find all parts of an island and mark them with a unique ID
    private static void findIsland(int[][] grid, int position_x, int position_y, int[][] islandIds, int id){
        // Base case: check boundaries and if the cell is already visited or water
        if(position_x<0 || position_y<0 || position_y >= grid.length || position_x >= grid.length || grid[position_x][position_y] == 0 || islandIds[position_x][position_y]!=0){
            return;
        }
        // Mark the current cell with the island ID
        islandIds[position_x][position_y] = id;

        // Increment the count of the current island
        islandCounts.put(id, islandCounts.get(id)+1);

        // Recursively check all four possible directions
        findIsland(grid, position_x-1,position_y, islandIds, id);
        findIsland(grid, position_x,position_y-1, islandIds, id);
        findIsland(grid, position_x+1,position_y, islandIds, id);
        findIsland(grid, position_x,position_y+1, islandIds, id);
    }

    // Function to calculate the potential new size of an island by converting a 0 to a 1
    private static int countNewSize(int[][] islandIds, int position_x, int position_y){
        // Start with 1 for the current cell that would be turned into a 1
        int count = 1;

        // To keep track of unique island IDs already considered
        HashSet<Integer> set = new HashSet();

        // Check all four possible directions
        if(position_x > 0 && islandIds[position_x-1][position_y]!=0 && !set.contains(islandIds[position_x-1][position_y])){
            set.add(islandIds[position_x-1][position_y]);
            count+= islandCounts.get(islandIds[position_x-1][position_y]);
        }
        if(position_y > 0 && islandIds[position_x][position_y-1]!=0 && !set.contains(islandIds[position_x][position_y-1])){
            set.add(islandIds[position_x][position_y-1]);
            count+= islandCounts.get(islandIds[position_x][position_y-1]);
        }
        if(position_x < islandIds.length-1 && islandIds[position_x+1][position_y]!=0 && !set.contains(islandIds[position_x+1][position_y])){
            set.add(islandIds[position_x+1][position_y]);
            count+= islandCounts.get(islandIds[position_x+1][position_y]);
        }
        if(position_y <islandIds.length-1 && islandIds[position_x][position_y+1]!=0 && !set.contains(islandIds[position_x][position_y+1])){
            set.add(islandIds[position_x][position_y+1]);
            count+= islandCounts.get(islandIds[position_x][position_y+1]);
        }
        return count;
    }
    
    // Main function to find the largest possible island
    public int largestIsland(int[][] grid) {
        int length = grid.length;
        int[][] islandIds = new int[length][length];
        int id = 0;

        // Identify and mark all islands with unique IDs
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                if(grid[i][j] == 1 && islandIds[i][j] == 0){
                    id++;
                    islandCounts.put(id,0);// Initialize the island count
                    findIsland(grid, i, j, islandIds, id);
                }
            }
        }
        int maxSize = 0;
        // Check each cell to see if converting a 0 to a 1 can form a larger island
        for (int i = 0; i < length; i++) {
            for(int j=0; j<length; j++){
                if(grid[i][j] == 0){
                    int size = countNewSize(islandIds, i, j);
                    maxSize = (maxSize>size)?maxSize:size;
                }
            }
        }
        // If no 0s are present, the largest island is the whole grid
        if(maxSize==0){
            return length*length;
        }
        return maxSize;
    }
}