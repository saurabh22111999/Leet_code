class Solution {
    public int fib(int n) {
        // edge cases
        if(n <= 1){
            return n;
        }
        
        // initialization
        int first = 0, second = 1, third = 1;
        
        // iterate from i = 2 to n to get 
        // the nth Fibonacci number
        for(int i = 2;i <= n;i++){
            third = first + second;
            first = second;
            second = third;
        }
        
        return third;
    }
}