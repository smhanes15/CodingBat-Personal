/*
 *  Array-1 --> makeMiddle
 *
 *    Given an array of ints of even length, return a new array length 2 containing the middle two
 *    elements from the original array. The original array will be length 2 or more.
 *
 *  Tests:
 *    makeMiddle([1, 2, 3, 4]) ? [2, 3]
 *    makeMiddle([7, 1, 2, 3, 4, 9]) ? [2, 3]
 *    makeMiddle([1, 2]) ? [1, 2]
 *    makeMiddle([5, 2, 4, 7]) ? [2, 4]
 *    makeMiddle([9, 0, 4, 3, 9, 1]) ? [4, 3]
 */
public class MakeMiddle {
  public int[] makeMiddle(int[] nums) {
    int middle = nums.length / 2;
    int newNums[] = {nums[middle - 1], nums[middle]};
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
