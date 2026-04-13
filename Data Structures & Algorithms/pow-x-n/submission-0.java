class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if(n>0){
         while(n>0){
            ans = ans * x;
            n--;
         }
        } else if(n<0) {
            while(n<0){
            ans = ans * (1 / x);
            n++;
         }
        } else{
            return 1;
        }
        return ans;

    }
}
