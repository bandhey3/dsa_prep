/*

The task is to complete the insertsort() function which is used to implement Insertion Sort.

Examples:

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: The sorted array will be [1, 3, 4, 7, 9].
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
Input: arr[] = [4, 1, 9]
Output: [1, 4, 9]
Explanation: The sorted array will be [1, 4, 9].
Constraints:
1 <= arr.size() <= 1000
1 <= arr[i] <= 1000

time complexity: O(n^2)
space complexity: O(1)

 */

package sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 6, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }
}
