/*

Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

Examples:

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Input: arr[] = [1, 3 , 2]
Output: [1, 2, 3]
Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 105

Time Complexity
Best, Average, Worst Case:  𝑂 ( 𝑛 log ⁡ 𝑛 ) O(nlogn)
The array is divided recursively into halves ( log ⁡ 𝑛 logn) and merged linearly ( 𝑂 ( 𝑛 ) O(n)).

Space Complexity
𝑂 ( 𝑛 ) O(n) due to the temporary storage for merging.

 */

package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Marge_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 6, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);


    }

    private static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }


}
