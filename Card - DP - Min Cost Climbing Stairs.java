class Solution {
    // set up memo and cost array
    private HashMap <Integer, Integer> memo = new HashMap<Integer, Integer>();
    private int[]cost;
    
    public int dp(int i){
        // base case
        if (i==0 || i==1){
            return 0;
        }
        
        //calculate the min cost for i step
        if(!memo.containsKey(i)){
            memo.put(i, Math.min((dp(i-1)+cost[i-1]), dp(i-2)+cost[i-2]));
        }
        
        return memo.get(i);
    }
    
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        return dp(cost.length);
    }
}
