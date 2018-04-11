/*
 *  Array-2 --> either24
 *
 *    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but
 *    not both.
 *
 *  Tests:
 *    either24([1, 2, 2]) ? true
 *    either24([4, 4, 1]) ? true
 *    either24([4, 4, 1, 2, 2]) ? false
 *    either24([1, 2, 3, 4]) ? false
 *    either24([3, 5, 9]) ? false
 *    either24([1, 2, 3, 4, 4]) ? true
 *    either24([2, 2, 3, 4]) ? true
 *    either24([1, 2, 3, 2, 2, 4]) ? true
 *    either24([1, 2, 3, 2, 2, 4, 4]) ? false
 *    either24([1, 2]) ? false
 *    either24([2, 2]) ? true
 *    either24([4, 4]) ? true
 *    either24([2]) ? false
 *    either24([]) ? false
 *    other tests
 */
public class Either24 {
  public boolean either24(int[] nums) {
    boolean two2 = false;
    boolean two4 = false;
    for (int x = 0; x < nums.length - 1; x++) {
      if (nums[x] == 2 && nums[x + 1] == 2) two2 = true;
      if (nums[x] == 4 && nums[x + 1] == 4) two4 = true;
    }
    if (two2 && two4) return false;
    return (two2 || two4);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
