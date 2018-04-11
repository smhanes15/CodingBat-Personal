/*
 *  Array-2 --> has22
 *
 *    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
 *
 *  Tests:
 *    has22([1, 2, 2]) ? true
 *    has22([1, 2, 1, 2]) ? false
 *    has22([2, 1, 2]) ? false
 *    has22([2, 2, 1, 2]) ? true
 *    has22([1, 3, 2]) ? false
 *    has22([1, 3, 2, 2]) ? true
 *    has22([2, 3, 2, 2]) ? true
 *    has22([4, 2, 4, 2, 2, 5]) ? true
 *    has22([1, 2]) ? false
 *    has22([2, 2]) ? true
 *    has22([2]) ? false
 *    has22([]) ? false
 *    has22([3, 3, 2, 2]) ? true
 *    has22([5, 2, 5, 2]) ? false
 *    other tests
 */
public class Has22 {
  public boolean has22(int[] nums) {
    for (int x = 0; x < nums.length - 1; x++) {
      if (nums[x] == 2 && nums[x + 1] == 2) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
