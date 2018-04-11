/*
 *  Array-2 --> sum67
 *
 *    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
 *    extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
 *
 *  Tests:
 *    sum67([1, 2, 2]) ? 5
 *    sum67([1, 2, 2, 6, 99, 99, 7]) ? 5
 *    sum67([1, 1, 6, 7, 2]) ? 4
 *    sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) ? 2
 *    sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) ? 2
 *    sum67([2, 7, 6, 2, 6, 7, 2, 7]) ? 18
 *    sum67([2, 7, 6, 2, 6, 2, 7]) ? 9
 *    sum67([1, 6, 7, 7]) ? 8
 *    sum67([6, 7, 1, 6, 7, 7]) ? 8
 *    sum67([6, 8, 1, 6, 7]) ? 0
 *    sum67([]) ? 0
 *    sum67([6, 7, 11]) ? 11
 *    sum67([11, 6, 7, 11]) ? 22
 *    sum67([2, 2, 6, 7, 7]) ? 11
 *    other tests
 */
public class Sum67 {
  public int sum67(int[] nums) {
    int sum = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 6) {
        for (int i = x; i < nums.length; i++) {
          int temp = nums[i];
          nums[i] = 0;
          if (temp == 7) i = nums.length;
        }
      }
      sum += nums[x];
    }
    return sum;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
