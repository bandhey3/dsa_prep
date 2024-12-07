/*
Given two integers N1 and N2, find their greatest common divisor.

Examples:

Example 1:
Input:N1 = 9, N2 = 12
Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.


Example 2:
Input:N1 = 20, N2 = 15
Output: 5
Explanation:Factors of 20: 1, 2, 4, 5
Factors of 15: 1, 3, 5
Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.



Time Complexity: O(min(N1, N2)) where N1 and N2 is the input number. The algorithm iterates from the minimum of N1 and N2 to 1 and each iteration checks whether both the numbers are divisible by the current number (constant time operations).

Space Complexity: O(1) as the space complexity remains constant and independent of the input size. Only a fixed amount of memory is required to store the integer variable

*/


package maths;



public class Greatest_Common_Divisor {

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 12;
        int hcf = gcd_optimal(n1,n2);

        System.out.println(hcf);

    }

//    Brute Force Approach
    private static int gcd_bf(int n1,int n2){
        int gcd_factor = 1;

        for (int i = 1; i <=Math.min(n1,n2); i++) {
            if (n1%i==0&&n2%i==0){
                gcd_factor = i;
            }
        }

        return gcd_factor;

    }



//    Optimal Approach (Euclidean Algorithm)
    private static int gcd_optimal(int a,int b){
        while(a>0&&b>0){

            if (a>b){
                a = a%b;
            }else {
                b = b%a;
            }

        }

        if (a==0){
            return b;
        }

        return a;

    }


}
