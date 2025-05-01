public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
         int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;            // Shift result left to make room
            result |= (n & 1);       // Copy the last bit of n
            n >>>= 1;                // Logical shift right
        }

        return result;
        
    }
}