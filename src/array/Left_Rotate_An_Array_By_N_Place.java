/*

Given an integer array nums, rotate the array to the left by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [4, 5, 6, 7, 1, 2, 3]


Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]






Time Complexity: 𝑂 ( 𝑛 ) O(n).
Space Complexity: 𝑂 ( 1 ) O(1).


 */

package array;


import java.util.Arrays;

public class Left_Rotate_An_Array_By_N_Place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
//        rotated_array_br(arr,k);
        rotated_array_op(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    //brute-force  { O(n+k) }
    private static void rotated_array_br(int[] arr,int k) {
        int n= arr.length;
        k = k%n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }

        for (int i = n-k; i < n; i++) {
            arr[i] = temp[i-(n-k)];
        }

    }


    //optimal { O(n) }
    private static void rotated_array_op(int[] arr,int k) {
        int n = arr.length;
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
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
