/*
 *  Array-2 --> zeroMax
 *
 *    Return a version of the given array where each zero value in the array is replaced by the largest
 *    odd value to the right of the zero in the array. If there is no odd value to the right of the zero,
 *    leave the zero as a zero.
 *
 *  Tests:
 *    zeroMax([0, 5, 0, 3]) ? [5, 5, 3, 3]
 *    zeroMax([0, 4, 0, 3]) ? [3, 4, 3, 3]
 *    zeroMax([0, 1, 0]) ? [1, 1, 0]
 *    zeroMax([0, 1, 5]) ? [5, 1, 5]
 *    zeroMax([0, 2, 0]) ? [0, 2, 0]
 *    zeroMax([1]) ? [1]
 *    zeroMax([0]) ? [0]
 *    zeroMax([]) ? []
 *    zeroMax([7, 0, 4, 3, 0, 2]) ? [7, 3, 4, 3, 0, 2]
 *    zeroMax([7, 0, 4, 3, 0, 1]) ? [7, 3, 4, 3, 1, 1]
 *    zeroMax([7, 0, 4, 3, 0, 0]) ? [7, 3, 4, 3, 0, 0]
 *    zeroMax([7, 0, 1, 0, 0, 7]) ? [7, 7, 1, 7, 7, 7]
 *    other tests
 */
public class ZeroMax {
  public int[] zeroMax(int[] nums) {
    int l = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 0) {
        for (int y = x + 1; y < nums.length; y++) {
          if (nums[y] % 2 != 0 && nums[y] > l) l = nums[y];
        }
        nums[x] = l;
        l = 0;
      }
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
