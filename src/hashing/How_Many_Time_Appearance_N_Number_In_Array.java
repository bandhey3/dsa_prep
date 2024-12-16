/*

You are given an array arr[] containing positive integers. The elements in the array arr[] range from 1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your task is to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

Examples

Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size()

 */

package hashing;

import java.util.ArrayList;
import java.util.Scanner;

public class How_Many_Time_Appearance_N_Number_In_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,2,6};
        System.out.println(appearanceList(arr));





    }


    // return a list
    private static ArrayList<Integer> appearanceList(int[] arr){
        // depends on time complexity
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i]--;
        }


        for (int j = 0; j < arr.length; j++) {
            int index = arr[j] % n;
            arr[index] += n;
        }

        for (int k = 0; k < arr.length; k++) {
            list.add(arr[k]/n);
        }

        return list;

    }

}
