/*
 *  Array-1 --> frontPiece
 *
 *    Given an int array of any length, return a new array of its first 2 elements. If the array is
 *    smaller than length 2, use whatever elements are present.
 *
 *  Tests:
 *    frontPiece([1, 2, 3]) ? [1, 2]
 *    frontPiece([1, 2]) ? [1, 2]
 *    frontPiece([1]) ? [1]
 *    frontPiece([]) ? []
 *    frontPiece([6, 5, 0]) ? [6, 5]
 *    frontPiece([6, 5]) ? [6, 5]
 *    frontPiece([3, 1, 4, 1, 5]) ? [3, 1]
 *    frontPiece([6]) ? [6]
 *    other tests
 */
public class FrontPiece {
  public int[] frontPiece(int[] nums) {
    if (nums.length == 0) {
      int[] newNums = new int[0];
      return newNums;
    }
    if (nums.length == 1) {
      int[] newNums = {nums[0]};
      return newNums;
    }
    int[] newNums = {nums[0], nums[1]};
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
