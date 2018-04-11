/*
 *  Array-1 --> makeEnds
 *
 *    Given an array of ints, return a new array length 2 containing the first and last elements from the
 *    original array. The original array will be length 1 or more.
 *
 *  Tests:
 *    makeEnds([1, 2, 3]) ? [1, 3]
 *    makeEnds([1, 2, 3, 4]) ? [1, 4]
 *    makeEnds([7, 4, 6, 2]) ? [7, 2]
 *    makeEnds([1, 2, 2, 2, 2, 2, 2, 3]) ? [1, 3]
 *    makeEnds([7, 4]) ? [7, 4]
 *    makeEnds([7]) ? [7, 7]
 *    makeEnds([5, 2, 9]) ? [5, 9]
 *    makeEnds([2, 3, 4, 1]) ? [2, 1]
 *    other tests
 */
public class MakeEnds {
  public int[] makeEnds(int[] nums) {
    int[] newNums = new int[2];
    if (nums.length > 1) {
      newNums[0] = nums[0];
      newNums[1] = nums[nums.length - 1];
    }
    if (nums.length == 1) {
      newNums[0] = nums[0];
      newNums[1] = nums[0];
    }
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
