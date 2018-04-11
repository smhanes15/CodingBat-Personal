/*
 *  Array-3 --> canBalance
 *
 *    Given a non-empty array, return true if there is a place to split the array so that the sum of the
 *    numbers on one side is equal to the sum of the numbers on the other side.
 *
 *  Tests:
 *    canBalance([1, 1, 1, 2, 1]) ? true
 *    canBalance([2, 1, 1, 2, 1]) ? false
 *    canBalance([10, 10]) ? true
 *    canBalance([10, 0, 1, -1, 10]) ? true
 *    canBalance([1, 1, 1, 1, 4]) ? true
 *    canBalance([2, 1, 1, 1, 4]) ? false
 *    canBalance([2, 3, 4, 1, 2]) ? false
 *    canBalance([1, 2, 3, 1, 0, 2, 3]) ? true
 *    canBalance([1, 2, 3, 1, 0, 1, 3]) ? false
 *    canBalance([1]) ? false
 *    canBalance([1, 1, 1, 2, 1]) ? true
 *    other tests
 */
public class CanBalance {
  public boolean canBalance(int[] nums) {
    int right = 0;
    for (int i = 0; i < nums.length; i++) {
      right += nums[i];
    }
    int left = 0;
    for (int i = 0; i < nums.length; i++) {
      left += nums[i];
      right -= nums[i];
      if (left == right) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
