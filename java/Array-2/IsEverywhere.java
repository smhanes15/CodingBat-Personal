/*
 *  Array-2 --> isEverywhere
 *
 *    We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the
 *    array, at least one of the pair is that value. Return true if the given value is everywhere in the
 *    array.
 *
 *  Tests:
 *    isEverywhere([1, 2, 1, 3], 1) ? true
 *    isEverywhere([1, 2, 1, 3], 2) ? false
 *    isEverywhere([1, 2, 1, 3, 4], 1) ? false
 *    isEverywhere([2, 1, 2, 1], 1) ? true
 *    isEverywhere([2, 1, 2, 1], 2) ? true
 *    isEverywhere([2, 1, 2, 3, 1], 2) ? false
 *    isEverywhere([3, 1], 3) ? true
 *    isEverywhere([3, 1], 2) ? false
 *    isEverywhere([3], 1) ? true
 *    isEverywhere([], 1) ? true
 *    isEverywhere([1, 2, 1, 2, 3, 2, 5], 2) ? true
 *    isEverywhere([1, 2, 1, 1, 1, 2], 2) ? false
 *    isEverywhere([2, 1, 2, 1, 1, 2], 2) ? false
 *    isEverywhere([2, 1, 2, 2, 2, 1, 1, 2], 2) ? false
 *    isEverywhere([2, 1, 2, 2, 2, 1, 2, 1], 2) ? true
 *    isEverywhere([2, 1, 2, 1, 2], 2) ? true
 *    other tests
 */
public class IsEverywhere {
  public boolean isEverywhere(int[] nums, int val) {
    boolean everywhere = true;
    for (int x = 0; x < nums.length - 1; x++) {
      if (nums[x] != val && nums[x + 1] != val) return false;
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
