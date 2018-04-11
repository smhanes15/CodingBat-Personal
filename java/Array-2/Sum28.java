/*
 *  Array-2 --> sum28
 *
 *    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
 *
 *  Tests:
 *    sum28([2, 3, 2, 2, 4, 2]) ? true
 *    sum28([2, 3, 2, 2, 4, 2, 2]) ? false
 *    sum28([1, 2, 3, 4]) ? false
 *    sum28([2, 2, 2, 2]) ? true
 *    sum28([1, 2, 2, 2, 2, 4]) ? true
 *    sum28([]) ? false
 *    sum28([2]) ? false
 *    sum28([8]) ? false
 *    sum28([2, 2, 2]) ? false
 *    sum28([2, 2, 2, 2, 2]) ? false
 *    sum28([1, 2, 2, 1, 2, 2]) ? true
 *    sum28([5, 2, 2, 2, 4, 2]) ? true
 *    other tests
 */
public class Sum28 {
  public boolean sum28(int[] nums) {
    int count = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 2) count++;
    }
    return (count == 4);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
