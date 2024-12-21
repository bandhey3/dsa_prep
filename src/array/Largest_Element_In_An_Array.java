/*

Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
Input: arr = [5, 5, 5, 5]
Output: 5
Explanation: The largest element of the given array is 5.
Input: arr = [10]
Output: 10
Explanation: There is only one element which is the largest.
Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 106

Time Complexity: 𝑂 ( 𝑛 ) O(n), where 𝑛 n is the number of elements in the array (single iteration).
Space Complexity: 𝑂 ( 1 ) O(1), as no extra space is used apart from the largest variable.


 */

package array;

public class Largest_Element_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 6, 1};
        System.out.println(largest_element(arr));
    }


    private static int largest_element(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int i: arr) {
            if (i>largest){
                largest = i;
            }
        }

        return largest;
    }
}
