/*
 *  Array-2 --> modThree
 *
 *    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to
 *    each other.
 *
 *  Tests:
 *    modThree([2, 1, 3, 5]) ? true
 *    modThree([2, 1, 2, 5]) ? false
 *    modThree([2, 4, 2, 5]) ? true
 *    modThree([1, 2, 1, 2, 1]) ? false
 *    modThree([9, 9, 9]) ? true
 *    modThree([1, 2, 1]) ? false
 *    modThree([1, 2]) ? false
 *    modThree([1]) ? false
 *    modThree([]) ? false
 *    modThree([9, 7, 2, 9]) ? false
 *    modThree([9, 7, 2, 9, 2, 2]) ? false
 *    modThree([9, 7, 2, 9, 2, 2, 6]) ? true
 *    other tests
 */
public class ModThree {
  public boolean modThree(int[] nums) {
    int l = nums.length;
    for (int x = 0; x < l - 2; x++) {
      if (nums[x] % 2 == 0 && nums[x + 1] % 2 == 0 && nums[x + 2] % 2 == 0) return true;
      if (nums[x] % 2 != 0 && nums[x + 1] % 2 != 0 && nums[x + 2] % 2 != 0) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
