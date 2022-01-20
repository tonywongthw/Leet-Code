class Solution {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    private int[] prices;
    private int min=10001;
    
    public int dp(int i){
        if (i==0){
            return 0;
        }
        
        if (!memo.containsKey(i)){
            // max profit is the previous max or new max
            memo.put(i, Math.max(dp(i-1),prices[i-1]-min));
            // after finding the max for i, update the new min for next calculation of max (i+1)
            if (prices[i-1]<min){
                min = prices[i-1];
            }
        }
      
        return memo.get(i);
    }
    
    public int maxProfit(int[] prices) {
        this.prices = prices;
        return dp(prices.length);
    }
}
