/*
 *  Array-3 --> seriesUp
 *
 *    Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} (spaces added to
 *    show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to
 *    sum to exactly n*(n + 1)/2.
 *
 *  Tests:
 *    seriesUp(3) ? [1, 1, 2, 1, 2, 3]
 *    seriesUp(4) ? [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 *    seriesUp(2) ? [1, 1, 2]
 *    seriesUp(1) ? [1]
 *    seriesUp(0) ? []
 *    seriesUp(6) ? [1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6]
 */
public class SeriesUp {
  public int[] seriesUp(int n) {
    int[] nums = new int[(n * (n + 1)) / 2];
    int index = 0;
    for (int x = 1; x <= n; x++) {
      for (int y = 0; y < x; y++) {
        nums[index + y] = y + 1;
      }
      index += x;
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
