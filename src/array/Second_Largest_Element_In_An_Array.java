/*

Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

Time Complexity: 𝑂 ( 𝑛 ) O(n), where 𝑛 n is the number of elements in the array (single iteration).
Space Complexity: 𝑂 ( 1 ) O(1), as no extra space is used apart from the largest variable.


 */

package array;

public class Second_Largest_Element_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 6, 1};
        System.out.println(second_largest_element(arr));
    }


    private static int second_largest_element(int[] arr){
        int largest = arr[0];
        int secLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secLargest = largest;
                largest  = arr[i];
            }else if (arr[i]>largest && arr[i]>secLargest){
                secLargest = arr[i];
            }
        }

        return secLargest;
    }
}
