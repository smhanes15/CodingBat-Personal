/*
 *  Array-1 --> rotateLeft3
 *
 *    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3}
 *    yields {2, 3, 1}.
 *
 *  Tests:
 *    rotateLeft3([1, 2, 3]) ? [2, 3, 1]
 *    rotateLeft3([5, 11, 9]) ? [11, 9, 5]
 *    rotateLeft3([7, 0, 0]) ? [0, 0, 7]
 *    rotateLeft3([1, 2, 1]) ? [2, 1, 1]
 *    rotateLeft3([0, 0, 1]) ? [0, 1, 0]
 *    other tests
 */
public class RotateLeft3 {
  public int[] rotateLeft3(int[] nums) {
    int first = nums[0];
    nums[0] = nums[1];
    nums[1] = nums[2];
    nums[2] = first;
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
