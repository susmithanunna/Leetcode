class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n==-1){
            return 1/x;
        }
        
         double halfPow = myPow(x, n / 2);
        double result = halfPow * halfPow;
        
        if(n % 2 != 0) { // If n is odd
            if(n > 0) {
                result *= x;
            } else {
                result /= x;
            }
        }
        
        return result;
    }
}