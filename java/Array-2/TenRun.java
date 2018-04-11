/*
 *  Array-2 --> tenRun
 *
 *    For each multiple of 10 in the given array, change all the values following it to be that multiple
 *    of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20,
 *    20}.
 *
 *  Tests:
 *    tenRun([2, 10, 3, 4, 20, 5]) ? [2, 10, 10, 10, 20, 20]
 *    tenRun([10, 1, 20, 2]) ? [10, 10, 20, 20]
 *    tenRun([10, 1, 9, 20]) ? [10, 10, 10, 20]
 *    tenRun([1, 2, 50, 1]) ? [1, 2, 50, 50]
 *    tenRun([1, 20, 50, 1]) ? [1, 20, 50, 50]
 *    tenRun([10, 10]) ? [10, 10]
 *    tenRun([10, 2]) ? [10, 10]
 *    tenRun([0, 2]) ? [0, 0]
 *    tenRun([1, 2]) ? [1, 2]
 *    tenRun([1]) ? [1]
 *    tenRun([]) ? []
 *    other tests
 */
public class TenRun {
  public int[] tenRun(int[] nums) {
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] % 10 == 0) {
        for (int y = x + 1; y < nums.length; y++) {
          if (nums[y] % 10 == 0) {
            y = nums.length;
          } else {
            nums[y] = nums[x];
          }
        }
      }
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
