/*
 *  Array-2 --> has12
 *
 *    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the
 *    array.
 *
 *  Tests:
 *    has12([1, 3, 2]) ? true
 *    has12([3, 1, 2]) ? true
 *    has12([3, 1, 4, 5, 2]) ? true
 *    has12([3, 1, 4, 5, 6]) ? false
 *    has12([3, 1, 4, 1, 6, 2]) ? true
 *    has12([2, 1, 4, 1, 6, 2]) ? true
 *    has12([2, 1, 4, 1, 6]) ? false
 *    has12([1]) ? false
 *    has12([2, 1, 3]) ? false
 *    has12([2, 1, 3, 2]) ? true
 *    has12([2]) ? false
 *    has12([3, 2]) ? false
 *    has12([3, 1, 3, 2]) ? true
 *    has12([3, 5, 9]) ? false
 *    has12([3, 5, 1]) ? false
 *    has12([3, 2, 1]) ? false
 *    has12([1, 2]) ? true
 *    other tests
 */
public class Has12 {
  public boolean has12(int[] nums) {
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 1) {
        for (int y = x + 1; y < nums.length; y++) {
          if (nums[y] == 2) return true;
        }
      }
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
