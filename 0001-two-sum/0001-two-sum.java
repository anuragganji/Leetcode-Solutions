class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();

        //for finding the solution pair
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int first=0,second=0;
       for(int i=0; i<nums.length; i++){
           if(set.contains(target-nums[i])){
               boolean flag = false;
               //to find the index of the pair
               for(int j=0;j<nums.length;j++){
                   //recording the index at solution pair
                   if(nums[j]==nums[i] || nums[j]==target-nums[i]){
                       if(!flag){
                           first = j;
                           //for duplicates
                           second = j;
                           flag = true;
                       }else{
                           second = j;
                       }
                   }
               }
               //if same number
               //if it is half the target
               if(first==second){
                   continue;
               }
               return new int[]{first, second};
           }
       }
       return new int[]{0,0};
    }
}