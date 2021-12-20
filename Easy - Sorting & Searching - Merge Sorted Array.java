class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // a new array for stroing the result
        int[] nums3 = new int[m+n];
      
         // initialises pointers for traversing the original two arrays and a new array
        int i=0, j=0, k=0;
        
        // if the ends of nums1 and nums2 are not yet reached, traverse them 
        // and copy the smaller integer to array nums3
        while (i<m && j<n){
            if (nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                i++;
            } else {
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        
        // if the end of nums1 is not yet reached, traverse it
        while (i<m){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        
        // if the end of nums2 is not yet reached, traverse it
        while(j<n){
            nums3[k]=nums2[j];
            j++;
            k++;
        }
        
        // copy answer from array nums3 to array nums1
        for (int l=0; l<m+n; l++){
            nums1[l]=nums3[l];
        }
    }
}
