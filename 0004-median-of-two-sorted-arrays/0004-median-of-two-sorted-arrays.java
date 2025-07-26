class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {

        int n=num1.length;
        int m=num2.length;

        int[] merged=new int[n+m];
        int k=0;

        for(int i=0;i<n;i++){
            merged[k++]=num1[i];
        }
        for(int i=0;i<m;i++){
            merged[k++]=num2[i];
        }
        
        Arrays.sort(merged);

        int total=merged.length;

        if(total%2==1){
            return (double)merged[total/2];
        }
        else{
            int mid1=merged[total/2-1];
            int mid2=merged[total/2];
            return (mid1+mid2)/2.0;
        }
        
    }
}