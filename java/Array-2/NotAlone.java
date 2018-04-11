/*
 *  Array-2 --> notAlone
 *
 *    We'll say that an element in an array is "alone" if there are values before and after it, and those
 *    values are different from it. Return a version of the given array where every instance of the given
 *    value which is alone is replaced by whichever value to its left or right is larger.
 *
 *  Tests:
 *    notAlone([1, 2, 3], 2) ? [1, 3, 3]
 *    notAlone([1, 2, 3, 2, 5, 2], 2) ? [1, 3, 3, 5, 5, 2]
 *    notAlone([3, 4], 3) ? [3, 4]
 *    notAlone([3, 3], 3) ? [3, 3]
 *    notAlone([1, 3, 1, 2], 1) ? [1, 3, 3, 2]
 *    notAlone([3], 3) ? [3]
 *    notAlone([], 3) ? []
 *    notAlone([7, 1, 6], 1) ? [7, 7, 6]
 *    notAlone([1, 1, 1], 1) ? [1, 1, 1]
 *    notAlone([1, 1, 1, 2], 1) ? [1, 1, 1, 2]
 *    other tests
 */
public class NotAlone {
  public int[] notAlone(int[] nums, int val) {
    for (int x = 1; x < nums.length - 1; x++) {
      if (nums[x] == val) {
        if (nums[x] != nums[x - 1] && nums[x] != nums[x + 1]) {
          nums[x] = Math.max(nums[x - 1], nums[x + 1]);
        }
      }
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
