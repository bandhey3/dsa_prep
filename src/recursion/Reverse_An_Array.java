/*

You are given an array of integers arr[]. Your task is to reverse the given array.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.
Constraints:
1<=arr.size()<=105
0<=arr[i]<=105


 */

package recursion;

import java.util.Arrays;

public class Reverse_An_Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(0,arr.length,arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int l, int n, int[] arr){
        if(l>=n/2) return;
        int temp = arr[l];
        arr[l] = arr[n-l-1];
        arr[n-l-1] = temp;
        reverse(l+1,n,arr);
    }

}
