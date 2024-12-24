/*

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105


Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?


Time Complexity: 𝑂 ( 𝑛 ) O(n).
Space Complexity: 𝑂 ( 1 ) O(1).


 */

package array;


import java.util.Arrays;

public class Right_Rotate_An_Array_By_N_Place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        rotated_array_br(arr,k);
//        rotated_array_op(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    //brute-force { O(n+k) }
    private static void rotated_array_br(int[] arr,int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Copy the last k elements into a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Step 2: Shift the first n-k elements to the right
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        // Step 3: Copy the elements from the temporary array back to the start
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

    }


    //optimal { O(n) }
    private static void rotated_array_op(int[] arr,int k) {
        int n = arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



}
