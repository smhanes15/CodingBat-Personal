/*
 *  Array-1 --> midThree
 *
 *    Given an array of ints of odd length, return a new array length 3 containing the elements from the
 *    middle of the array. The array length will be at least 3.
 *
 *  Tests:
 *    midThree([1, 2, 3, 4, 5]) ? [2, 3, 4]
 *    midThree([8, 6, 7, 5, 3, 0, 9]) ? [7, 5, 3]
 *    midThree([1, 2, 3]) ? [1, 2, 3]
 */
public class MidThree {
  public int[] midThree(int[] nums) {
    int[] newNums = new int[3];
    int mid = Math.round(nums.length / 2);
    newNums[0] = nums[mid - 1];
    newNums[1] = nums[mid];
    newNums[2] = nums[mid + 1];
    return newNums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
