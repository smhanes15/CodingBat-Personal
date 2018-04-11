/*
 *  Array-2 --> twoTwo
 *
 *    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 *
 *  Tests:
 *    twoTwo([4, 2, 2, 3]) ? true
 *    twoTwo([2, 2, 4]) ? true
 *    twoTwo([2, 2, 4, 2]) ? false
 *    twoTwo([1, 3, 4]) ? true
 *    twoTwo([1, 2, 2, 3, 4]) ? true
 *    twoTwo([1, 2, 3, 4]) ? false
 *    twoTwo([2, 2]) ? true
 *    twoTwo([2, 2, 7]) ? true
 *    twoTwo([2, 2, 7, 2, 1]) ? false
 *    twoTwo([4, 2, 2, 2]) ? true
 *    twoTwo([2, 2, 2]) ? true
 *    twoTwo([1, 2]) ? false
 *    twoTwo([2]) ? false
 *    twoTwo([1]) ? true
 *    twoTwo([]) ? true
 *    twoTwo([5, 2, 2, 3]) ? true
 *    twoTwo([2, 2, 5, 2]) ? false
 *    other tests
 */
public class TwoTwo {
  public boolean twoTwo(int[] nums) {
    if (nums.length == 0) return true;
    if (nums.length == 1 && nums[0] == 2) return false;
    for (int x = 0; x < nums.length; x++) {
      if (x == 0) {
        if (nums[x] == 2 && nums[x + 1] != 2) return false;
      }
      if (x == nums.length - 1) {
        if (nums[x] == 2 && nums[x - 1] != 2) return false;
      }
      if (x > 0 && x < nums.length - 1) {
        if (nums[x] == 2 && !(nums[x - 1] == 2 || nums[x + 1] == 2)) return false;
      }
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
