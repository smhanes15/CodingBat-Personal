/*
 *  Array-2 --> sum13
 *
 *    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is
 *    very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
 *
 *  Tests:
 *    sum13([1, 2, 2, 1]) ? 6
 *    sum13([1, 1]) ? 2
 *    sum13([1, 2, 2, 1, 13]) ? 6
 *    sum13([1, 2, 13, 2, 1, 13]) ? 4
 *    sum13([13, 1, 2, 13, 2, 1, 13]) ? 3
 *    sum13([]) ? 0
 *    sum13([13]) ? 0
 *    sum13([13, 13]) ? 0
 *    sum13([13, 0, 13]) ? 0
 *    sum13([13, 1, 13]) ? 0
 *    sum13([5, 7, 2]) ? 14
 *    sum13([5, 13, 2]) ? 5
 *    sum13([0]) ? 0
 *    sum13([13, 0]) ? 0
 *    other tests
 */
public class Sum13 {
  public int sum13(int[] nums) {
    int sum = 0;
    for (int x = 0; x < nums.length; x++) {
      sum += (nums[x] != 13) ? nums[x] : 0;
      if (nums[x] == 13) x++;
    }
    return sum;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
