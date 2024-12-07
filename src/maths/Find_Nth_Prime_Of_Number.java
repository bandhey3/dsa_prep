/*
Given an integer n, return all n numbers of prime.

Examples:

Input: n = 10
Output: 29


Input: n = 2
Output: 3


Time Complexity: O(sqrt(n)), where n is the input number.
Auxiliary Space: O(1)

*/


package maths;



public class Find_Nth_Prime_Of_Number {

    public static void main(String[] args) {
        int n = 3;
        int isPrime = prime(n);
        System.out.println(isPrime);
    }

    private static int prime(int n) {

        int count = 0;
        int num = 1;
        while (count<n){
            num++;
            if(isPrime(num)){
                count++;
            }
        }


        return num;
    }

    private static boolean isPrime(int n){
        int cnt = 0;

        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                cnt++;
                if (n/i!=i){
                    cnt++;
                }
            }

        }

        return cnt==2;

    }


}
