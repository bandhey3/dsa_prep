/*

Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1

Time Complexity : O(log10(n)) or O(number of digits), where n is the input number
Auxiliary Space: O(1) or constant.



*/


package maths;

public class Reverse_A_Number {

    public static void main(String[] args) {
        int n = -134000;
        int reverser_number = reverse(n);
        System.out.println(reverser_number);
    }

    private static int reverse(int n){
        int new_verse = 0;
        while (n!=0){
            if (new_verse>Integer.MAX_VALUE/10||new_verse<Integer.MIN_VALUE/10){
                return 0;
            }
            int rem = n%10;
            n/=10;
            new_verse = (new_verse*10)+rem;
        }

        return new_verse;
    }

}
