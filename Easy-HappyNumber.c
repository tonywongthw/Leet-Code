# include <math.h>

int sumofsq(int n);

bool isHappy(int n){
    int sum=n;
    int count=0;
    
    // check if the value of sum is 1
    while (sum!=1){
        sum = sumofsq(sum);
        printf("sum is %d \n", sum);
        //if sum falls to infinite loop, return false
        count++;
        if (count>6){
            return 0;
        }
    }
    // if sum is 1, return true
    return 1;
}

// function to calculate the sum of equare of digits
int sumofsq(int n){
    int ans=0;
    while (n>0){
        // sum the square of digits one by one, starting from the right most digit
        ans += pow(n%10,2);
        // update n to remove the rightmost digit one by one
        if (n%10==0){
            n = n/10;
        } else {
            n -= n%10;
        }
        // optional line below for cross checking result
        //printf("n is %d, ans is %d \n", n, ans);
    }
    return ans;
}
