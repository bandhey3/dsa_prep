

/*


Given an integer n, return true if and only if it is an Armstrong number.

The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n.



Example 1:

Input: n = 153
Output: true
Explanation: 153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
Example 2:

Input: n = 123
Output: false
Explanation: 123 is a 3-digit number, and 123 != 1^3 + 2^3 + 3^3 = 36.


Constraints:

1 <= n <= 108


The time complexity is O( log10 n ) , and the space complexity is O( log10 n ) . Here, n is the given number.


*/

package maths;

public class Armstrong_Number {

    public static void main(String[] args) {

        int n = 153;
        boolean isArmstrong = armstrong(n);

        System.out.println(n+" number is "+(isArmstrong?"armstrong":"not armstrong"));

    }

    private static boolean armstrong(int n){
        int num = n;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            sum += (int) Math.pow(rem,3);
            n/=10;
        }

        return sum==num;
    }


}
