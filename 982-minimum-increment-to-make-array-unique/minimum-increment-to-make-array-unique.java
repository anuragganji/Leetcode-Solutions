class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int duplicates = 0;
        int steps = 0;
        for(int i=1 ;i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                duplicates++;
                continue;
            }
            if(duplicates>0){
                int n = nums[i]-nums[i-1];
                int temp = Math.max(0, duplicates - (n-1));
                steps += ((duplicates-temp)*((duplicates-temp)+1))/2;
                duplicates = temp;
                steps += duplicates*n;
            }
        }
        steps += (duplicates*(duplicates+1))/2;
        return steps;
    }
}