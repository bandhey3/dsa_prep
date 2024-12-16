/*

You are given an array arr[] containing positive integers. The elements in the array arr[] range from 1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your task is to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

Examples

Input: arr[] = [2, 3, 2, 3, 5], n=2
Output: 2
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
Input: arr[] = [3, 3, 3, 3], n=1
Output: 0
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
Input: arr[] = [1], n=1
Output: 1
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
Constraints:
1 ≤ arr.length ≤ 106
1 ≤ arr[i] ≤ arr.length

 */

package hashing;

import java.util.Scanner;

public class How_Many_Time_Appearance_N_Number_In_Array_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,2,6};
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        System.out.println(appearanceNum(arr,n));

    }

    // return a number
    private static int appearanceNum(int[] arr, int n){
        // depends on time complexity
        int[] count = new int[arr.length+1];

        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int j = 0; j < arr.length; j++) {
            count[arr[j]] += 1;
        }

        return count[n];

    }

}
