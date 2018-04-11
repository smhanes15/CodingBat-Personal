/*
 *  Array-2 --> more14
 *
 *    Given an array of ints, return true if the number of 1's is greater than the number of 4's
 *
 *  Tests:
 *    more14([1, 4, 1]) ? true
 *    more14([1, 4, 1, 4]) ? false
 *    more14([1, 1]) ? true
 *    more14([1, 6, 6]) ? true
 *    more14([1]) ? true
 *    more14([1, 4]) ? false
 *    more14([6, 1, 1]) ? true
 *    more14([1, 6, 4]) ? false
 *    more14([1, 1, 4, 4, 1]) ? true
 *    more14([1, 1, 6, 4, 4, 1]) ? true
 *    more14([]) ? false
 *    more14([4, 1, 4, 6]) ? false
 *    more14([4, 1, 4, 6, 1]) ? false
 *    more14([1, 4, 1, 4, 1, 6]) ? true
 *    other tests
 */
public class More14 {
  public boolean more14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 1) ones++;
      if (nums[x] == 4) fours++;
    }
    return (ones > fours);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
