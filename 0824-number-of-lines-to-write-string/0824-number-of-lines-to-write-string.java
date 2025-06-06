class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count=1;
        int sum=0;
        for(char c:s.toCharArray()){
            if(sum+widths[c-'a']<=100){
                sum+=widths[c-'a'];
            }
            else{
                sum=widths[c-'a'];
                count++;
            }
        }
        return new int[]{count,sum};
    }
}