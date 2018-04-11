/*
 *  Array-2 --> withoutTen
 *
 *    Return a version of the given array where all the 10's have been removed. The remaining elements
 *    should shift left towards the start of the array as needed, and the empty spaces a the end of the
 *    array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array
 *    or make a new array.
 *
 *  Tests:
 *    withoutTen([1, 10, 10, 2]) ? [1, 2, 0, 0]
 *    withoutTen([10, 2, 10]) ? [2, 0, 0]
 *    withoutTen([1, 99, 10]) ? [1, 99, 0]
 *    withoutTen([10, 13, 10, 14]) ? [13, 14, 0, 0]
 *    withoutTen([10, 13, 10, 14, 10]) ? [13, 14, 0, 0, 0]
 *    withoutTen([10, 10, 3]) ? [3, 0, 0]
 *    withoutTen([1]) ? [1]
 *    withoutTen([13, 1]) ? [13, 1]
 *    withoutTen([10]) ? [0]
 *    withoutTen([]) ? []
 *    other tests
 */
public class WithoutTen {
  public int[] withoutTen(int[] nums) {
    int[] newNums = new int[nums.length];
    int newPos = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] != 10) {
        newNums[newPos] = nums[x];
        newPos++;
      }
    }
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
