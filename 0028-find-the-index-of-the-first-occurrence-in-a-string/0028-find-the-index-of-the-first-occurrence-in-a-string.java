class Solution {
    public int strStr(String haystack, String needle) {
//         int l=needle.length();
//         if(haystack.length()<=1){
//             return 0;
//         }
//         if(needle.length()<=1){
            
//         }
//         for(int i=0;i<haystack.length()-needle.length();i++){
//             if(haystack.substring(i,i+needle.length()).equals(needle)){
//                 return i;
//             }
//         }
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0,j=needle.length();j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}