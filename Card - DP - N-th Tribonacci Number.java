class Solution {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    
    public int dp(int i){
        if (i==0){
            return 0;
        }
        if (i==1 || i==2){
            return 1;
        }
        
        if(!memo.containsKey(i)){
            memo.put(i, dp(i-3)+dp(i-2)+dp(i-1));
        }
        
        return memo.get(i);
    }
    
    public int tribonacci(int n) {
        return dp(n);
    }
}
