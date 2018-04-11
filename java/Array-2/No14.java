/*
 *  Array-2 --> no14
 *
 *    Given an array of ints, return true if it contains no 1's or it contains no 4's.
 *
 *  Tests:
 *    no14([1, 2, 3]) ? true
 *    no14([1, 2, 3, 4]) ? false
 *    no14([2, 3, 4]) ? true
 *    no14([1, 1, 4, 4]) ? false
 *    no14([2, 2, 4, 4]) ? true
 *    no14([2, 3, 4, 1]) ? false
 *    no14([2, 1, 1]) ? true
 *    no14([1, 4]) ? false
 *    no14([2]) ? true
 *    no14([2, 1]) ? true
 *    no14([1]) ? true
 *    no14([4]) ? true
 *    no14([]) ? true
 *    no14([1, 1, 1, 1]) ? true
 *    no14([9, 4, 4, 1]) ? false
 *    no14([4, 2, 3, 1]) ? false
 *    no14([4, 2, 3, 5]) ? true
 *    no14([4, 4, 2]) ? true
 *    no14([1, 4, 4]) ? false
 *    other tests
 */
public class No14 {
  public boolean no14(int[] nums) {
    boolean ones = false;
    boolean fours = false;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 1) ones = true;
      if (nums[x] == 4) fours = true;
    }
    if (ones && fours) return false;
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
