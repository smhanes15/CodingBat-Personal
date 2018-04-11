/*
 *  Array-1 --> unlucky1
 *
 *    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the
 *    given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 *
 *  Tests:
 *    unlucky1([1, 3, 4, 5]) ? true
 *    unlucky1([2, 1, 3, 4, 5]) ? true
 *    unlucky1([1, 1, 1]) ? false
 *    unlucky1([1, 3, 1]) ? true
 *    unlucky1([1, 1, 3]) ? true
 *    unlucky1([1, 2, 3]) ? false
 *    unlucky1([3, 3, 3]) ? false
 *    unlucky1([1, 3]) ? true
 *    unlucky1([1, 4]) ? false
 *    unlucky1([1]) ? false
 *    unlucky1([]) ? false
 *    unlucky1([1, 1, 1, 3, 1]) ? false
 *    unlucky1([1, 1, 3, 1, 1]) ? true
 *    unlucky1([1, 1, 1, 1, 3]) ? true
 *    unlucky1([1, 4, 1, 5]) ? false
 *    unlucky1([1, 1, 2, 3]) ? false
 *    unlucky1([2, 3, 2, 1]) ? false
 *    unlucky1([2, 3, 1, 3]) ? true
 *    unlucky1([1, 2, 3, 4, 1, 3]) ? true
 *    other tests
 */
public class Unlucky1 {
  public boolean unlucky1(int[] nums) {
    boolean unlucky = false;
    for (int x = 0; x < nums.length - 1; x++) {
      if (nums[x] == 1 && nums[x + 1] == 3) {
        unlucky = true;
      }
      if (x >= 1 && x < nums.length - 2) {
        x = nums.length - 3;
      }
    }
    return unlucky;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
