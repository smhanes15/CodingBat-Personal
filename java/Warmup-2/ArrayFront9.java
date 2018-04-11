/*
 *  Warmup-2 --> arrayFront9
 *
 *    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array
 *    length may be less than 4.
 *
 *  Tests:
 *    arrayFront9([1, 2, 9, 3, 4]) ? true
 *    arrayFront9([1, 2, 3, 4, 9]) ? false
 *    arrayFront9([1, 2, 3, 4, 5]) ? false
 *    arrayFront9([9, 2, 3]) ? true
 *    arrayFront9([1, 9, 9]) ? true
 *    arrayFront9([1, 2, 3]) ? false
 *    arrayFront9([1, 9]) ? true
 *    arrayFront9([5, 5]) ? false
 *    arrayFront9([2]) ? false
 *    arrayFront9([9]) ? true
 *    arrayFront9([]) ? false
 *    arrayFront9([3, 9, 2, 3, 3]) ? true
 */
public class ArrayFront9 {
  public boolean arrayFront9(int[] nums) {
    int length = nums.length;
    for (int x = 0; x < length; x++) {
      if ((nums[x] == 9) && (x < 4)) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //