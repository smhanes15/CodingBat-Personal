/*
 *  Array-1 --> sameFirstLast
 *
 *    Given an array of ints, return true if the array is length 1 or more, and the first element and the
 *    last element are equal.
 *
 *  Tests:
 *    sameFirstLast([1, 2, 3]) ? false
 *    sameFirstLast([1, 2, 3, 1]) ? true
 *    sameFirstLast([1, 2, 1]) ? true
 *    sameFirstLast([7]) ? true
 *    sameFirstLast([]) ? false
 *    sameFirstLast([1, 2, 3, 4, 5, 1]) ? true
 *    sameFirstLast([1, 2, 3, 4, 5, 13]) ? false
 *    sameFirstLast([13, 2, 3, 4, 5, 13]) ? true
 *    sameFirstLast([7, 7]) ? true
 *    other tests
 */
public class SameFirstLast {
  public boolean sameFirstLast(int[] nums) {
    return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
