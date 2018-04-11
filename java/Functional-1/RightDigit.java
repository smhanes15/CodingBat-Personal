/*
 *  Functional-1 --> rightDigit
 *
 *    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
 *
 *  Tests:
 *    rightDigit([1, 22, 93]) ? [1, 2, 3]
 *    rightDigit([16, 8, 886, 8, 1]) ? [6, 8, 6, 8, 1]
 *    rightDigit([10, 0]) ? [0, 0]
 *    rightDigit([]) ? []
 *    rightDigit([5, 10]) ? [5, 0]
 *    rightDigit([5, 50, 500, 5000, 5000]) ? [5, 0, 0, 0, 0]
 *    rightDigit([6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2]) ? [6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2]
 *    other tests
 */
public class RightDigit {
  public List<Integer> rightDigit(List<Integer> nums) {
    nums.replaceAll(n -> n % 10);
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
