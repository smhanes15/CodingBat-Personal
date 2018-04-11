/*
 *  Warmup-2 --> array123
 *
 *    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array
 *    somewhere.
 *
 *  Tests:
 *    array123([1, 1, 2, 3, 1]) ? true
 *    array123([1, 1, 2, 4, 1]) ? false
 *    array123([1, 1, 2, 1, 2, 3]) ? true
 *    array123([1, 1, 2, 1, 2, 1]) ? false
 *    array123([1, 2, 3, 1, 2, 3]) ? true
 *    array123([1, 2, 3]) ? true
 *    array123([1, 1, 1]) ? false
 *    array123([1, 2]) ? false
 *    array123([1]) ? false
 *    array123([]) ? false
 */
public class Array123 {
  public boolean array123(int[] nums) {
    return Arrays.toString(nums).contains("1, 2, 3");
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
