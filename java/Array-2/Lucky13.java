/*
 *  Array-2 --> lucky13
 *
 *    Given an array of ints, return true if the array contains no 1's and no 3's.
 *
 *  Tests:
 *    lucky13([0, 2, 4]) ? true
 *    lucky13([1, 2, 3]) ? false
 *    lucky13([1, 2, 4]) ? false
 *    lucky13([2, 7, 2, 8]) ? true
 *    lucky13([2, 7, 1, 8]) ? false
 *    lucky13([3, 7, 2, 8]) ? false
 *    lucky13([2, 7, 2, 1]) ? false
 *    lucky13([1, 2]) ? false
 *    lucky13([2, 2]) ? true
 *    lucky13([2]) ? true
 *    lucky13([3]) ? false
 *    lucky13([]) ? true
 *    other tests
 */
public class Lucky13 {
  public boolean lucky13(int[] nums) {
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 1 || nums[x] == 3) return false;
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
