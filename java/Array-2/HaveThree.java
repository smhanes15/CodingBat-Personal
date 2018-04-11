/*
 *  Array-2 --> haveThree
 *
 *    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's
 *    are next to each other.
 *
 *  Tests:
 *    haveThree([3, 1, 3, 1, 3]) ? true
 *    haveThree([3, 1, 3, 3]) ? false
 *    haveThree([3, 4, 3, 3, 4]) ? false
 *    haveThree([1, 3, 1, 3, 1, 2]) ? false
 *    haveThree([1, 3, 1, 3, 1, 3]) ? true
 *    haveThree([1, 3, 3, 1, 3]) ? false
 *    haveThree([1, 3, 1, 3, 1, 3, 4, 3]) ? false
 *    haveThree([3, 4, 3, 4, 3, 4, 4]) ? true
 *    haveThree([3, 3, 3]) ? false
 *    haveThree([1, 3]) ? false
 *    haveThree([3]) ? false
 *    haveThree([1]) ? false
 *    other tests
 */
public class HaveThree {
  public boolean haveThree(int[] nums) {
    int count = 0;
    for (int x = 0; x < nums.length; x++) {
      if (nums[x] == 3) {
        if (x == 0) count++;
        else if (nums[x - 1] != 3) count++;
      }
    }
    return (count == 3);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
