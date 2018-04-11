/*
 *  Array-2 --> countEvens
 *
 *    Return the number of even ints in the given array. Note: the % "mod" operator computes the
 *    remainder, e.g. 5 % 2 is 1.
 *
 *  Tests:
 *    countEvens([2, 1, 2, 3, 4]) ? 3
 *    countEvens([2, 2, 0]) ? 3
 *    countEvens([1, 3, 5]) ? 0
 *    countEvens([]) ? 0
 *    countEvens([11, 9, 0, 1]) ? 1
 *    countEvens([2, 11, 9, 0]) ? 2
 *    countEvens([2]) ? 1
 *    countEvens([2, 5, 12]) ? 2
 *    other tests
 */
public class CountEvens {
  public int countEvens(int[] nums) {
    int count = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] % 2 == 0) {
        count++;
      }
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
