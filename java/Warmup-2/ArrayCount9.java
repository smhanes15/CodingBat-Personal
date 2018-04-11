/*
 *  Warmup-2 --> arrayCount9
 *
 *    Given an array of ints, return the number of 9's in the array.
 *
 *  Tests:
 *    arrayCount9([1, 2, 9]) ? 1
 *    arrayCount9([1, 9, 9]) ? 2
 *    arrayCount9([1, 9, 9, 3, 9]) ? 3
 *    arrayCount9([1, 2, 3]) ? 0
 *    arrayCount9([]) ? 0
 *    arrayCount9([4, 2, 4, 3, 1]) ? 0
 *    arrayCount9([9, 2, 4, 3, 1]) ? 1
 */
public class ArrayCount9 {
  public int arrayCount9(int[] nums) {
    int count = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 9) count++;
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
