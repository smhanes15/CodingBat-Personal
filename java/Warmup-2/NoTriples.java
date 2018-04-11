/*
 *  Warmup-2 --> noTriples
 *
 *    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
 *    Return true if the array does not contain any triples.
 *
 *  Tests:
 *    noTriples([1, 1, 2, 2, 1]) ? true
 *    noTriples([1, 1, 2, 2, 2, 1]) ? false
 *    noTriples([1, 1, 1, 2, 2, 2, 1]) ? false
 *    noTriples([1, 1, 2, 2, 1, 2, 1]) ? true
 *    noTriples([1, 2, 1]) ? true
 *    noTriples([1, 1, 1]) ? false
 *    noTriples([1, 1]) ? true
 *    noTriples([1]) ? true
 *    noTriples([]) ? true
 */
public class NoTriples {
  public boolean noTriples(int[] nums) {
    for (int x = 0; x < nums.length - 2; x++) {
      if (nums[x] == nums[x + 1]) {
        if (nums[x] == nums[x + 2]) {
          return false;
        }
      }
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
