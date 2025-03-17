class Solution {
    public int findNumbers(int[] nums) {

        int evenCount=0;
        int count=0;
        for(int i:nums){
            while(i!=0){
                i=i/10;
                count++;
            }
            if(count%2==0){
                evenCount++;
            }
            count=0;

        }
        return evenCount;
        
    }
}