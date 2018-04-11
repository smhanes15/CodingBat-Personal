/*
 *  Array-2 --> fizzArray3
 *
 *    Given start and end numbers, return a new array containing the sequence of integers from start up to
 *    but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater
 *    or equal to the start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
 *
 *  Tests:
 *    fizzArray3(5, 10) ? [5, 6, 7, 8, 9]
 *    fizzArray3(11, 18) ? [11, 12, 13, 14, 15, 16, 17]
 *    fizzArray3(1, 3) ? [1, 2]
 *    fizzArray3(1, 2) ? [1]
 *    fizzArray3(1, 1) ? []
 *    fizzArray3(1000, 1005) ? [1000, 1001, 1002, 1003, 1004]
 *    other tests
 */
public class FizzArray3 {
  public int[] fizzArray3(int start, int end) {
    if (start == end) return new int[0];
    int[] nums = new int[end - start];
    for (int x = 0; x < nums.length; x++) {
      nums[x] = start++;
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
