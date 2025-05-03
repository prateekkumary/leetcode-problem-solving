class Solution {
    public int hammingWeight(int n) {
        String bit=Integer.toBinaryString(n);
        char[] cb=bit.toCharArray();
        int count=0;
        for(int i=0;i<cb.length;i++){
            if(cb[i]=='1'){
                count++;
            }

        }
        return count;
    }
}