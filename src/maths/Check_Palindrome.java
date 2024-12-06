/*

Given an integer x, return true if x is a
        palindrome
, and false otherwise.



        Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
        Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

        -231 <= x <= 231 - 1




*/

package maths;

public class Check_Palindrome {

    public static void main(String[] args) {
        int n = 123;
        boolean check_palindrome = palindrome(n);
        System.out.println(check_palindrome);
    }

    private static boolean palindrome(int n) {
        int num = n;
        int isSame = 0;

        while (n > 0) {
            int rem = n % 10;
            isSame = isSame * 10 + rem;
            n /= 10;
        }

        return num == isSame;

    }


}
