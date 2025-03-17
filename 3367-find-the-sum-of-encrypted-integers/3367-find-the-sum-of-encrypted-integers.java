class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        int maxD=0;
        int count=0;
        for(int i:nums){
            if(i<10){
                sum+=i;
            }
            else {
             while(i!=0){
                int d=i%10;
                maxD=Math.max(maxD,d);
                i=i/10;
                count++;
             }
             int encNum=0;
             while(count!=0){
                encNum=encNum*10+1;
                 
                count--;
             }
              sum+=encNum*maxD;
              maxD=0;
             
            }
           
            
             
        }
        return sum;
    }
}