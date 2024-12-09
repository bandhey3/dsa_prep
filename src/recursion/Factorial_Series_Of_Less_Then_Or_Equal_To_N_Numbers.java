/*

A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

Examples:

Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.
Input: n = 6
Output: 1 2 6
Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers.
Expected Time Complexity: O(k), Where k is the number of factorial numbers.
Expected Auxiliary Space: O(1)

Constraints:
1<=n<=1018

 */


package recursion;

import java.util.ArrayList;

public class Factorial_Series_Of_Less_Then_Or_Equal_To_N_Numbers {
    public static void main(String[] args) {
        System.out.println(num(720));
    }

    private static ArrayList<Long> num(long n){

        ArrayList<Long> factorial = new ArrayList<>();
        long fact = 1;
        long i = 1;

        while (fact <= n){
            factorial.add(fact);
            i++;
            fact *= i;
        }

        return factorial;


    }

}
