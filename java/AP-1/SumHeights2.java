/*
 *  AP-1 --> sumHeights2
 *
 *    (A variation on the sumHeights problem.) We have an array of heights, representing the altitude
 *    along a walking trail. Given start/end indexes into the array, return the sum of the changes for a
 *    walk beginning at the start index and ending at the end index, however increases in height count
 *    double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 =
 *    7. The start end end index will both be valid indexes into the array with start <= end.
 *
 *  Tests:
 *    sumHeights2([5, 3, 6, 7, 2], 2, 4) ? 7
 *    sumHeights2([5, 3, 6, 7, 2], 0, 1) ? 2
 *    sumHeights2([5, 3, 6, 7, 2], 0, 4) ? 15
 *    sumHeights2([5, 3, 6, 7, 2], 1, 1) ? 0
 *    sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3) ? 6
 *    sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8) ? 19
 *    sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8) ? 16
 *    sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8) ? 0
 *    sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2) ? 0
 *    sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6) ? 4
 *    sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 4) ? 1
 *    sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 5) ? 2
 *    other tests
 */
public class SumHeights2 {
  public int sumHeights2(int[] heights, int start, int end) {
    int sum = 0;
    for (int x = start; x < end; x++) {
      if (heights[x] > heights[x + 1]) {
        sum += heights[x] - heights[x + 1];
      } else {
        sum += Math.abs(heights[x] - heights[x + 1]) * 2;
      }
    }
    return sum;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
