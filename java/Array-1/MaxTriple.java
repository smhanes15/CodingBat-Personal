/*
 *  Array-1 --> maxTriple
 *
 *    Given an array of ints of odd length, look at the first, last, and middle values in the array and
 *    return the largest. The array length will be a least 1.
 *
 *  Tests:
 *    maxTriple([1, 2, 3]) ? 3
 *    maxTriple([1, 5, 3]) ? 5
 *    maxTriple([5, 2, 3]) ? 5
 *    maxTriple([1, 2, 3, 1, 1]) ? 3
 *    maxTriple([1, 7, 3, 1, 5]) ? 5
 *    maxTriple([5, 1, 3, 7, 1]) ? 5
 *    maxTriple([5, 1, 7, 3, 7, 8, 1]) ? 5
 *    maxTriple([5, 1, 7, 9, 7, 8, 1]) ? 9
 *    maxTriple([5, 1, 7, 3, 7, 8, 9]) ? 9
 *    maxTriple([2, 2, 5, 1, 1]) ? 5
 *    other tests
 */
public class MaxTriple {
  public int maxTriple(int[] nums) {
    if (nums.length == 1) return nums[0];
    int mid = Math.round(nums.length / 2);
    int last = nums.length - 1;
    int large = nums[0];
    if (nums[mid] > large) large = nums[mid];
    if (nums[last] > large) large = nums[last];
    return large;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
