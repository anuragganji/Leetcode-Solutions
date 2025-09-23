class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int i=1, j = x, result =0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(x==mid*mid){
                return mid;
            }
            if((long)mid*mid <(long) x){
                i = mid+1;
                result = mid;
            }else{
                j = mid-1;
            }
        }
        return result;
    }
}