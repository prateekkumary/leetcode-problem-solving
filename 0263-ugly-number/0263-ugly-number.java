class Solution {
    public boolean isUgly(int n) {
          if(n<=0){
            return false;
        }
        int div[]= {2,3,5};
        for(int divisor:div){
            while(n%divisor==0){
                n/=divisor;
            }
        }        
        return n==1;
    }
}