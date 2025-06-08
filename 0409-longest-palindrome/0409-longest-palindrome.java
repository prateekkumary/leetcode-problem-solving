class Solution {
    public int longestPalindrome(String s) {
        int oddCount=0;
        int[] freq=new int[128];

        for(char c:s.toCharArray()){
            freq[c]++;
            if(freq[c]%2==1)
                oddCount++;
            else
                oddCount--;
        }
        if(oddCount>1){
            return s.length()-oddCount+1;
        }
        return s.length();
    }
}