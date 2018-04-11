/*
 *  Array-2 --> shiftLeft
 *
 *    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may
 *    modify and return the given array, or return a new array.
 *
 *  Tests:
 *    shiftLeft([6, 2, 5, 3]) ? [2, 5, 3, 6]
 *    shiftLeft([1, 2]) ? [2, 1]
 *    shiftLeft([1]) ? [1]
 *    shiftLeft([]) ? []
 *    shiftLeft([1, 1, 2, 2, 4]) ? [1, 2, 2, 4, 1]
 *    shiftLeft([1, 1, 1]) ? [1, 1, 1]
 *    shiftLeft([1, 2, 3]) ? [2, 3, 1]
 *    other tests
 */
public class ShiftLeft {
  public int[] shiftLeft(int[] nums) {
    if (nums.length == 0) return nums;
    int[] newNums = new int[nums.length];
    for (int x = 0; x < nums.length - 1; x++) {
      newNums[x] = nums[x + 1];
    }
    newNums[newNums.length - 1] = nums[0];
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
