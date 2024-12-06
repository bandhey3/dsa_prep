/*
Given a natural number n, print all distinct divisors of it.

Examples:

Input: n = 10
Output: 1 2 5 10
Explanation: 1, 2, 5 and 10 are the factors of 10.


Input: n = 100
Output: 1 2 4 5 10 20 25 50 100
Explanation: 1, 2, 4, 5, 10, 20, 25, 50 and 100 are factors of 100.


Input: n = 125
Output: 1 5 25 125


Time Complexity: O(sqrt(n)), where n is the input number.
Auxiliary Space: O(1)

*/


package maths;

import java.util.ArrayList;
import java.util.Collections;

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


        Collections.sort(list);

        return list;

    }



}
