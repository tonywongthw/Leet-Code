class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int numnine=0;
        
        //check if all digits are nine
        for (int i = 0; i<size ;i++){
            if (digits[i]==9){
                numnine++;
            }
        }
        
        int new_size = size;
        
        //special case if all digits are 9
        if (numnine==new_size){
            new_size++;
            int[]answer = new int[new_size];
            answer[0]=1;
            return answer;
        }
        
        int[]answer2 = new int[new_size];
        int processed=0;
        
        //create a new array to store the answer
        for (int j = 0; j<new_size ;j++){
            if (processed==0){
                if (digits[new_size-j-1]==9){
                    answer2[new_size-j-1]=0;
                } else {
                    answer2[new_size-j-1]=digits[new_size-j-1]+1;
                    processed=1;
                }
            } else {
                answer2[new_size-j-1]=digits[new_size-j-1];
            }
        }
        return answer2;   
    }
}
