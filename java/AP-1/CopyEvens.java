/*
 *  AP-1 --> copyEvens
 *
 *    Given an array of positive ints, return a new array of length "count" containing the first even
 *    numbers from the original array. The original array will contain at least "count" even numbers.
 *
 *  Tests:
 *    copyEvens([3, 2, 4, 5, 8], 2) ? [2, 4]
 *    copyEvens([3, 2, 4, 5, 8], 3) ? [2, 4, 8]
 *    copyEvens([6, 1, 2, 4, 5, 8], 3) ? [6, 2, 4]
 *    copyEvens([6, 1, 2, 4, 5, 8], 4) ? [6, 2, 4, 8]
 *    copyEvens([3, 1, 4, 1, 5], 1) ? [4]
 *    copyEvens([2], 1) ? [2]
 *    copyEvens([6, 2, 4, 8], 2) ? [6, 2]
 *    copyEvens([6, 2, 4, 8], 3) ? [6, 2, 4]
 *    copyEvens([6, 2, 4, 8], 4) ? [6, 2, 4, 8]
 *    copyEvens([1, 8, 4], 1) ? [8]
 *    copyEvens([1, 8, 4], 2) ? [8, 4]
 *    copyEvens([2, 8, 4], 2) ? [2, 8]
 *    other tests
 */
public class CopyEvens {
  public int[] copyEvens(int[] nums, int count) {
    int newNums[] = new int[count];
    int z = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] % 2 == 0 && z < count) {
        newNums[z] = nums[x];
        z++;
      }
    }
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
