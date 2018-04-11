/*
 *  Array-2 --> zeroFront
 *
 *    Return an array that contains the exact same numbers as the given array, but rearranged so that all
 *    the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter.
 *    So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 *
 *  Tests:
 *    zeroFront([1, 0, 0, 1]) ? [0, 0, 1, 1]
 *    zeroFront([0, 1, 1, 0, 1]) ? [0, 0, 1, 1, 1]
 *    zeroFront([1, 0]) ? [0, 1]
 *    zeroFront([0, 1]) ? [0, 1]
 *    zeroFront([1, 1, 1, 0]) ? [0, 1, 1, 1]
 *    zeroFront([2, 2, 2, 2]) ? [2, 2, 2, 2]
 *    zeroFront([0, 0, 1, 0]) ? [0, 0, 0, 1]
 *    zeroFront([-1, 0, 0, -1, 0]) ? [0, 0, 0, -1, -1]
 *    zeroFront([0, -3, 0, -3]) ? [0, 0, -3, -3]
 *    zeroFront([]) ? []
 *    zeroFront([9, 9, 0, 9, 0, 9]) ? [0, 0, 9, 9, 9, 9]
 *    other tests
 */
public class ZeroFront {
  public int[] zeroFront(int[] nums) {
    int b = 0;
    int e = nums.length - 1;
    int[] newNums = new int[nums.length];
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 0) {
        newNums[b] = 0;
        b++;
      } else {
        newNums[e] = nums[x];
        e--;
      }
    }
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
