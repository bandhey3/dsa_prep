/*
Given an integer n, return if that given number prime or not.

Examples:

Input: n = 10
Output: false


Input: n = 2
Output: true


Time Complexity: O(sqrt(n)), where n is the input number.
Auxiliary Space: O(1)

*/


package maths;


public class Check_Prime_number {

    public static void main(String[] args) {
        int n = 9;
        boolean isPrime = prime(n);
        System.out.println(isPrime);
    }

    private static boolean prime(int n) {

        int cnt = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                if (n / i != i) {
                    cnt++;
                }
            }
        }


        return cnt == 2;

    }


}
