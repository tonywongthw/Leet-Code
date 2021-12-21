/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1, j=n;   
        
        // binary search algorithm, moving i and j closer
        // till i is index of the first bad version
        while (i<j){
            // formula below preventing over-flow
            int m = i+(j-i)/2;
            if (isBadVersion(m)){
                j = m;
            } else {
                i = m+1;
            }
        }
        return i;
    }
}
