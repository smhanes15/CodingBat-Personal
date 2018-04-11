/*
 *  Recursion-1 --> array220
 *
 *    Given an array of ints, compute recursively if the array contains somewhere a value followed in the
 *    array by that value times 10. We'll use the convention of considering only the part of the array
 *    that begins at the given index. In this way, a recursive call can pass index+1 to move down the
 *    array. The initial call will pass in index as 0.
 *
 *  Tests:
 *    array220([1, 2, 20], 0) ? true
 *    array220([3, 30], 0) ? true
 *    array220([3], 0) ? false
 *    array220([], 0) ? false
 *    array220([3, 3, 30, 4], 0) ? true
 *    array220([2, 19, 4], 0) ? false
 *    array220([20, 2, 21], 0) ? false
 *    array220([20, 2, 21, 210], 0) ? true
 *    array220([2, 200, 2000], 0) ? true
 *    array220([0, 0], 0) ? true
 *    array220([1, 2, 3, 4, 5, 6], 0) ? false
 *    array220([1, 2, 3, 4, 5, 50, 6], 0) ? true
 *    array220([1, 2, 3, 4, 5, 51, 6], 0) ? false
 *    array220([1, 2, 3, 4, 4, 50, 500, 6], 0) ? true
 *    other tests
 */
public class Array220 {
  public boolean array220(int[] nums, int index) {
    if (index < nums.length - 1) {
      if (nums[index] * 10 == nums[index + 1]) return true;
      return array220(nums, index + 1);
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
