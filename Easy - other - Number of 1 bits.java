public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        System.out.println("original no.:" + n);
        String s; 
        
        // handling positive and negative cases
        if (n>=0){
            s = int_to_binstr(n);
        } else {            
            
            //edge case of min max
            if (n==-2147483648){
                return 1;
            }
            
            // convert the negative int to positive int
            int pos = 0-n;
            //System.out.println("processed +ve no.:" + pos);
            
            // get the string of positive value in binary
            s = int_to_binstr(pos);
            //System.out.println("String of +ve no. in binary: " + s);
            
            // process string to reverse 0 and 1, and add 1 bit
            s = process(s);
            //System.out.println("String processed: " + s);
        }
        
        // count the number of 1 bits.
        int count=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='1'){
                count++;
            }
        }
        
        return count;
    }
    
    public String int_to_binstr(int n){
        String s="";
        while (n>0){
            if (n%2==1){
                s = "1"+s;
            } else {
                s = "0"+s;
            }
            n=n/2;
        }
        return s;
    }
    
    public String process(String s){
        // make the string length to 32
        while (s.length()<32){
            s = '0' + s;
        }
        //System.out.println(s);
        
        // invert 0 and 1
        String s2="";
        for (int i = 31; i>=0; i--){
            if (s.charAt(i)=='0'){
                s2="1"+s2;
            } else {
                s2="0"+s2;
            }
        }
        //System.out.println(s2);
        
        // add 1 bit
        String s3="";
        int processed = 0;
        for (int i = 31; i>=0; i--){
            if (processed==0){
                if (s2.charAt(i)=='0'){
                    s3= "1" + s3;
                    processed=1;
                } else {
                    s3= "0" + s3;
                }                    
            } else {
                s3= s2.charAt(i) + s3;
            }
        }
        //System.out.println(s3);
        return s3;
    }
}
