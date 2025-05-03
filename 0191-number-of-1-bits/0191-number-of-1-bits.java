class Solution {
    public int hammingWeight(int n) {
        // String bit=Integer.toBinaryString(n);
        // char[] cb=bit.toCharArray();
        int count=0;
        for(int i=0;i<32;i++){
            if((( n >> i) & 1)==1){
                count++;
            }
            // if(cb[i]=='1'){
            //     count++;
            // }

        }
        return count;
    }
}

// or (int i = 0; i < 32; i++) {
//         if (((n >> i) & 1) == 1) {
//             count++;
//         }
//     }
//     return count;