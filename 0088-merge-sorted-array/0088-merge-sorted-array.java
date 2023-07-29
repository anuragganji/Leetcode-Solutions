class Solution {

   
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i=n-1; i>=0;i--)
          nums1[m+i]=nums2[i];
      Arrays.sort(nums1);
}
}