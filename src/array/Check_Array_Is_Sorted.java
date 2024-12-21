/*

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.



Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100


Time Complexity: 𝑂 ( 𝑛 ) O(n), where 𝑛 n is the number of elements in the array (single iteration).
Space Complexity: 𝑂 ( 1 ) O(1), as no extra space is used apart from the largest variable.


 */

package array;

public class Check_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 6, 1};
//        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(is_sorted(arr));
    }

    private static boolean is_sorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;

    }
}
