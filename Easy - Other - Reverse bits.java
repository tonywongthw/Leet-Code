public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int ans=0;        
        for (int j=0; j<32; j++){
            // check if the right most binary digit of n is 1
            if ((n&1)==1){
                ans = ans + 1;
            }
            //signed left shift to fill right most places with 0s
            if (j<31){
                ans = ans << 1;
            }
            // unsigned shift of n to the right by one
            n = n >>> 1;
        }
        return ans;
    }
}
