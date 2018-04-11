/*
 *  Array-2 --> only14
 *
 *    Given an array of ints, return true if every element is a 1 or a 4.
 *
 *  Tests:
 *    only14([1, 4, 1, 4]) ? true
 *    only14([1, 4, 2, 4]) ? false
 *    only14([1, 1]) ? true
 *    only14([4, 1]) ? true
 *    only14([2]) ? false
 *    only14([]) ? true
 *    only14([1, 4, 1, 3]) ? false
 *    only14([3, 1, 3]) ? false
 *    only14([1]) ? true
 *    only14([4]) ? true
 *    only14([3, 4]) ? false
 *    only14([1, 3, 4]) ? false
 *    only14([1, 1, 1]) ? true
 *    only14([1, 1, 1, 5]) ? false
 *    only14([4, 1, 4, 1]) ? true
 *    other tests
 */
public class Only14 {
  public boolean only14(int[] nums) {
    boolean nums14 = true;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] != 1 && nums[x] != 4) nums14 = false;
    }
    return nums14;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
