/*

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).



Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


Constraints:

0 <= n <= 30

Time Complexity: 𝑂 (2^𝑛) O(2^n)
Space Complexity: 𝑂 (𝑛) O(n) (due to recursion stack)

 */


package recursion;

import java.util.Scanner;

public class Fibonacci_Number {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        System.out.println(fibonacci_bf(n));

    }


    private static int fibonacci_bf(int n){
        if(n<=1){
            return n;
        }

        return fibonacci_bf(n-1) + fibonacci_bf(n-2);
    }


}
