/*
 *  Functional-2 --> noNeg
 *
 *    Given a list of integers, return a list of the integers, omitting any that are less than 0.
 *
 *  Tests:
 *    noNeg([1, -2]) ? [1]
 *    noNeg([-3, -3, 3, 3]) ? [3, 3]
 *    noNeg([-1, -1, -1]) ? []
 *    noNeg([]) ? []
 *    noNeg([0, 1, 2]) ? [0, 1, 2]
 *    noNeg([3, -10, 1, -1, 4, -400]) ? [3, 1, 4]
 *    noNeg([-1, 3, 1, -1, -10, -100, -111, 5]) ? [3, 1, 5]
 *    other tests
 */
public class NoNeg {
  public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf(n -> n < 0);
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
