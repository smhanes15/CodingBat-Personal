/*
 *  Array-1 --> maxEnd3
 *
 *    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
 *    and set all the other elements to be that value. Return the changed array.
 *
 *  Tests:
 *    maxEnd3([1, 2, 3]) ? [3, 3, 3]
 *    maxEnd3([11, 5, 9]) ? [11, 11, 11]
 *    maxEnd3([2, 11, 3]) ? [3, 3, 3]
 *    maxEnd3([11, 3, 3]) ? [11, 11, 11]
 *    maxEnd3([3, 11, 11]) ? [11, 11, 11]
 *    maxEnd3([2, 2, 2]) ? [2, 2, 2]
 *    maxEnd3([2, 11, 2]) ? [2, 2, 2]
 *    maxEnd3([0, 0, 1]) ? [1, 1, 1]
 *    other tests
 */
public class MaxEnd3 {
  public int[] maxEnd3(int[] nums) {
    int large = nums[0];
    if (nums[2] > large) large = nums[2];
    nums[0] = large;
    nums[1] = large;
    nums[2] = large;
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
