/*
 *  Array-2 --> post4
 *
 *    Given a non-empty array of ints, return a new array containing the elements from the original array
 *    that come after the last 4 in the original array. The original array will contain at least one 4.
 *    Note that it is valid in java to create an array of length 0.
 *
 *  Tests:
 *    post4([2, 4, 1, 2]) ? [1, 2]
 *    post4([4, 1, 4, 2]) ? [2]
 *    post4([4, 4, 1, 2, 3]) ? [1, 2, 3]
 *    post4([4, 2]) ? [2]
 *    post4([4, 4, 3]) ? [3]
 *    post4([4, 4]) ? []
 *    post4([4]) ? []
 *    post4([2, 4, 1, 4, 3, 2]) ? [3, 2]
 *    post4([4, 1, 4, 2, 2, 2]) ? [2, 2, 2]
 *    post4([3, 4, 3, 2]) ? [3, 2]
 *    other tests
 */
public class Post4 {
  public int[] post4(int[] nums) {
    int loc = 0;
    for (int x = nums.length - 1; x > 0; x--) {
      if (nums[x] == 4) {
        loc = x;
        x = 0;
      }
    }
    int[] newNums = new int[nums.length - (loc + 1)];
    for (int x = loc + 1; x < nums.length; x++) {
      newNums[x - (loc + 1)] = nums[x];
    }
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
