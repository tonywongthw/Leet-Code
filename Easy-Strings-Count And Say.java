class Solution {
    public String countAndSay(int n) {
        //base case
        if (n==1){
            return "1";
        }
        //case for n>1
        return process(countAndSay(n-1));
    }
    
    public String process(String s){
        int l= s.length();
        
        //set the current character, and count the number
        char curr_char=s.charAt(0);
        int count=1;
        
        //set the resulting string
        String ans = "";
      
        //count the number of curr_char, and append in the ans
        for (int i=1; i<l; i++){
            if (s.charAt(i)==curr_char){
                count++;
                continue;
            } else {
                ans = ans + count + curr_char;
                curr_char=s.charAt(i);
                count=1;
            }
        }
        //append the last character
        ans = ans + count + curr_char;
        return ans;
    }
}
