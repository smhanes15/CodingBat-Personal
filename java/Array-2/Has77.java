/*
 *  Array-2 --> has77
 *
 *    Given an array of ints, return true if the array contains two 7's next to each other, or there are
 *    two 7's separated by one element, such as with {7, 1, 7}.
 *
 *  Tests:
 *    has77([1, 7, 7]) ? true
 *    has77([1, 7, 1, 7]) ? true
 *    has77([1, 7, 1, 1, 7]) ? false
 *    has77([7, 7, 1, 1, 7]) ? true
 *    has77([2, 7, 2, 2, 7, 2]) ? false
 *    has77([2, 7, 2, 2, 7, 7]) ? true
 *    has77([7, 2, 7, 2, 2, 7]) ? true
 *    has77([7, 2, 6, 2, 2, 7]) ? false
 *    has77([7, 7, 7]) ? true
 *    has77([7, 1, 7]) ? true
 *    has77([7, 1, 1]) ? false
 *    has77([1, 2]) ? false
 *    has77([1, 7]) ? false
 *    has77([7]) ? false
 *    other tests
 */
public class Has77 {
  public boolean has77(int[] nums) {
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 7) {
        if (x < nums.length - 1) {
          if (nums[x + 1] == 7) return true;
        }
        if (x < nums.length - 2) {
          if (nums[x + 2] == 7) return true;
        }
      }
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
