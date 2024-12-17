/*

The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.



Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.
Example 2:

Input: nums = [1,4,8,13], k = 5
Output: 2
Explanation: There are multiple optimal solutions:
- Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
- Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
- Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
Example 3:

Input: nums = [3,9,6], k = 2
Output: 1


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
1 <= k <= 105


Time Complexity:
    Sorting: 𝑂 ( 𝑛 log ⁡ 𝑛 ) O(nlogn)
    Sliding Window: 𝑂 ( 𝑛 ) O(n)
    Total Complexity: 𝑂 ( 𝑛 log ⁡ 𝑛 ) O(nlogn)

Space Complexity: 𝑂 ( 1 ) O(1) extra space (apart from input array).


 */

package hashing;

import java.util.Arrays;

public class Frequency_Of_The_Most_Frequent_Element {
    public static void main(String[] args) {
        int[] arr = {8,4,5,3};
        int k = 5;
        System.out.println(frequent_bt(arr,k));
        System.out.println(frequent_op(arr,k));
    }

    // brute-force
    private static int frequent_bt(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0;
        int total = 0;
        int maxFreq = 1;

        for (int right = 0; right < arr.length; right++) {
            long target = arr[right];
            total += arr[right];

            while (target*(right-left+1)-total>k){
                total -= arr[left];
                left++;
            }

            maxFreq = Math.max(maxFreq,(right-left+1));

        }

        return maxFreq;
    }


    // optimal
    private static int frequent_op(int[] arr, int k){
        Arrays.sort(arr);
        int left =0;
        long total = 0;

        for(int right = 0; right < arr.length; right++) {

            long target = arr[right];
            total += arr[right];

            if((right-left+1)*target-total>k){
                total -= arr[left];
                left++;
            }
        }

        return arr.length - left;
    }
}
