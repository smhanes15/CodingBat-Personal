/*
 *  Warmup-2 --> array667
 *
 *    Given an array of ints, return the number of times that two 6's are next to each other in the array.
 *    Also count instances where the second "6" is actually a 7.
 *
 *  Tests:
 *    array667([6, 6, 2]) ? 1
 *    array667([6, 6, 2, 6]) ? 1
 *    array667([6, 7, 2, 6]) ? 1
 *    array667([6, 6, 2, 6, 7]) ? 2
 *    array667([1, 6, 3]) ? 0
 *    array667([6, 1]) ? 0
 *    array667([]) ? 0
 *    array667([3, 6, 7, 6]) ? 1
 *    array667([3, 6, 6, 7]) ? 2
 *    array667([6, 3, 6, 6]) ? 1
 *    array667([6, 7, 6, 6]) ? 2
 *    array667([1, 2, 3, 5, 6]) ? 0
 *    array667([1, 2, 3, 6, 6]) ? 1
 */
public class Array667 {
  public int array667(int[] nums) {
    int count = 0;
    for (int x = 0; x < nums.length - 1; x++) {
      if (nums[x] == 6) {
        if (nums[x + 1] == 6 || nums[x + 1] == 7) count++;
      }
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
