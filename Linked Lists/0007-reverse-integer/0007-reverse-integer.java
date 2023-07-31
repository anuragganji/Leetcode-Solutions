class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        boolean flag=(x>=0)?true:false;
        x=Math.abs(x);
        long n=0;
        while(x>0){
            n=n*10+x%10;
            x/=10;
        }
        if (n > Integer.MAX_VALUE) {
            return 0;
        } else{ 
            
            return (flag)?(int)n:-1*(int)n;
        }
    }
}