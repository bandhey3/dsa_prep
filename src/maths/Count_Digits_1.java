/*

Given a number n, the task is to return the count of digits in this number.

Example:

Input: n = 1567
Output: 4
Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.

Input: n = 255
Output: 3
Explanation: The are 3 digits in 256, which are 2, 5 and 5.

Input: n = 58964
Output: 5
Explanation: There are 5 digits in 58964, which are 5, 8, 9, 6 and 4.

Time Complexity : O(log10(n)) or O(number of digits), where n is the input number
Auxiliary Space: O(1) or constant.


*/


package maths;

public class Count_Digits_1 {

    public static void main(String[] args) {

        int n = 1235;
        int counts = count_digits(n);

        System.out.println(counts);

    }

    private static int count_digits(int n) {

        int count=0;
        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;

    }

}
