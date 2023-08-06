class Solution {

   
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size=m+n-1;
        int a=m-1, b=n-1;
        for(int i=size;i>=0;i--){
            if(nums1[i]!=0){
                break;
            }
            if(a>=0 && b>=0 && nums1[a] >= nums2[b]){
                nums1[i] = nums1[a];
                nums1[a] = 0;
                a--;
            }else{
                if(b>=0){
                    nums1[i] = nums2[b];
                    b--;
                }
            }
        }
}
}