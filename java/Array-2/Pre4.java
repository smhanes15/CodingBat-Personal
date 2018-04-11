/*
 *  Array-2 --> pre4
 *
 *    Given a non-empty array of ints, return a new array containing the elements from the original array
 *    that come before the first 4 in the original array. The original array will contain at least one 4.
 *    Note that it is valid in java to create an array of length 0.
 *
 *  Tests:
 *    pre4([1, 2, 4, 1]) ? [1, 2]
 *    pre4([3, 1, 4]) ? [3, 1]
 *    pre4([1, 4, 4]) ? [1]
 *    pre4([1, 4, 4, 2]) ? [1]
 *    pre4([1, 3, 4, 2, 4]) ? [1, 3]
 *    pre4([4, 4]) ? []
 *    pre4([3, 3, 4]) ? [3, 3]
 *    pre4([1, 2, 1, 4]) ? [1, 2, 1]
 *    pre4([2, 1, 4, 2]) ? [2, 1]
 *    pre4([2, 1, 2, 1, 4, 2]) ? [2, 1, 2, 1]
 *    other tests
 */
public class Pre4 {
  public int[] pre4(int[] nums) {
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 4) {
        return Arrays.copyOfRange(nums, 0, x);
      }
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
