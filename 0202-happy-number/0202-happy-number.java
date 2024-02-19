class Solution {
    public boolean isHappy(int n) {
       int sum=0,d;
        int b=0;
        do{
           sum=0; 
        while(n>0){
            d=n%10;
            sum+=d*d;
            n=n/10;
        }
        n=sum;
        b++;
        }
        while(sum!=1&&b<9);
            if(sum==1){
            return true;
            }
            
        
        return false;
        
        
    }
}