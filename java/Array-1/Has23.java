/*
 *  Array-1 --> has23
 *
 *    Given an int array length 2, return true if it contains a 2 or a 3.
 *
 *  Tests:
 *    has23([2, 5]) ? true
 *    has23([4, 3]) ? true
 *    has23([4, 5]) ? false
 *    has23([2, 2]) ? true
 *    has23([3, 2]) ? true
 *    has23([3, 3]) ? true
 *    has23([7, 7]) ? false
 *    has23([3, 9]) ? true
 *    has23([9, 5]) ? false
 *    other tests
 */
public class Has23 {
  public boolean has23(int[] nums) {
    if (nums[0] == 2 || nums[0] == 3) return true;
    if (nums[1] == 2 || nums[1] == 3) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
