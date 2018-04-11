/*
 *  Array-2 --> fizzArray
 *
 *    Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ...
 *    n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate
 *    if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so
 *    it just works. The syntax to make a new int array is: new int[desired_length] (See also: FizzBuzz
 *    Code)
 *
 *  Tests:
 *    fizzArray(4) ? [0, 1, 2, 3]
 *    fizzArray(1) ? [0]
 *    fizzArray(10) ? [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 *    fizzArray(0) ? []
 *    fizzArray(2) ? [0, 1]
 *    fizzArray(7) ? [0, 1, 2, 3, 4, 5, 6]
 *    other tests
 */
public class FizzArray {
  public int[] fizzArray(int n) {
    int[] nums = new int[n];
    for (int x = 0; x < n; x++) {
      nums[x] = x;
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
