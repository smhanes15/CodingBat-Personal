/*
 *  Array-3 --> countClumps
 *
 *    Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return
 *    the number of clumps in the given array.
 *
 *  Tests:
 *    countClumps([1, 2, 2, 3, 4, 4]) ? 2
 *    countClumps([1, 1, 2, 1, 1]) ? 2
 *    countClumps([1, 1, 1, 1, 1]) ? 1
 *    countClumps([1, 2, 3]) ? 0
 *    countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) ? 4
 *    countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) ? 4
 *    countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) ? 5
 *    countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) ? 5
 *    countClumps([]) ? 0
 *    other tests
 */
public class CountClumps {
  public int countClumps(int[] nums) {
    int count = 0;
    for (int x = 0; x < nums.length - 1; x++) {
      if (nums[x] == nums[x + 1]) {
        count++;
        for (int y = x + 1; y < nums.length; y++) {
          if (nums[x] == nums[y]) {
            x++;
          } else {
            y = nums.length;
          }
        }
      }
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
