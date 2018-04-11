/*
 *  Array-1 --> double23
 *
 *    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length
 *    0, 1, or 2.
 *
 *  Tests:
 *    double23([2, 2]) ? true
 *    double23([3, 3]) ? true
 *    double23([2, 3]) ? false
 *    double23([3, 2]) ? false
 *    double23([4, 5]) ? false
 *    double23([2]) ? false
 *    double23([3]) ? false
 *    double23([]) ? false
 *    double23([3, 4]) ? false
 *    other tests
 */
public class Double23 {
  public boolean double23(int[] nums) {
    if (nums.length < 2) return false;
    int count2 = 0;
    int count3 = 0;
    if (nums[0] == 2) count2++;
    if (nums[1] == 2) count2++;
    if (nums.length > 2 && nums[2] == 2) count2++;
    if (nums[0] == 3) count3++;
    if (nums[1] == 3) count3++;
    if (nums.length > 2 && nums[2] == 3) count3++;
    if (count2 > 1 || count3 > 1) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
