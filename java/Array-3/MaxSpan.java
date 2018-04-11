/*
 *  Array-3 --> maxSpan
 *
 *    Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span"
 *    is the number of elements between the two inclusive. A single value has a span of 1. Returns the
 *    largest span found in the given array. (Efficiency is not a priority.)
 *
 *  Tests:
 *    maxSpan([1, 2, 1, 1, 3]) ? 4
 *    maxSpan([1, 4, 2, 1, 4, 1, 4]) ? 6
 *    maxSpan([1, 4, 2, 1, 4, 4, 4]) ? 6
 *    maxSpan([3, 3, 3]) ? 3
 *    maxSpan([3, 9, 3]) ? 3
 *    maxSpan([3, 9, 9]) ? 2
 *    maxSpan([3, 9]) ? 1
 *    maxSpan([3, 3]) ? 2
 *    maxSpan([]) ? 0
 *    maxSpan([1]) ? 1
 *    other tests
 */
public class MaxSpan {
  public int maxSpan(int[] nums) {
    if (nums.length < 2) return nums.length;
    int span = 1;
    for (int x = 0; x < nums.length; x++) {
      for (int y = nums.length - 1; y > x; y--) {
        if (nums[x] == nums[y]) {
          span = Math.max(span, y - x + 1);
        }
      }
    }
    return span;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
