/*
Given an integer n, return all n numbers of prime.

Examples:

Input: n = 10
Output: 2,3,5,7


Input: n = 2
Output: 2


Time Complexity: O(sqrt(n)), where n is the input number.
Auxiliary Space: O(1)

*/


package maths;


import java.util.ArrayList;

public class Find_N_Prime_Of_Numbers {

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> isPrime = prime(n);
        System.out.println(isPrime);
    }

    private static ArrayList<Integer> prime(int n) {

        ArrayList<Integer> primeNumber = new ArrayList<>();
        int num = 2;
        while (num<n){
            if(isPrime(num)){
                primeNumber.add(num);
            }
            num++;
        }


        return primeNumber;
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
