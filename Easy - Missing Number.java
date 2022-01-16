class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        // check if 0 is presense
        if (nums[0]!=0){
            return 0;
        }
        
        // check if 1 to nums.length - -1 is presense
        for (int i=0; i<nums.length-1; i++){
            if (nums[i+1]-nums[i]>1){
                return nums[i+1]-1;
            }
        }
        
        // case of nums.length is missing in the array
        return nums.length;
    }
}
