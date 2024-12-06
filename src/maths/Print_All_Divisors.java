/*
Given a positive integer n, The task is to find the value of Σi from 1 to n F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

Examples:

Input: n = 4
Output: 15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
So, F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7 = 15
Input: n = 5
Output: 21
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
F(5) = 1 + 5 = 6
So,  F(1) + F(2) + F(3) + F(4) + F(5)
    = 1 + 3 + 4 + 7 + 6 = 21
Input: n = 1
Output: 1
Explanation:
F(1) = 1
So,  F(1) = 1
Constraints:
        1 <= n <= 105


*/


package maths;

import java.util.ArrayList;

public class Print_All_Divisors {

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> divisorsList = divisors(n);
        System.out.println(divisorsList);
    }

    private static ArrayList<Integer> divisors(int n){

        ArrayList<Integer> list = new ArrayList<>();

        int i = 1;
        while (i <=(int)Math.sqrt(n)) {
            if(n%i==0){
                list.add(i);
                if (n/i!=i){
                    list.add(n/i);
                }
            }
            i++;
        }



        return list;

    }



}
