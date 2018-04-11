/*
 *  Functional-2 --> no9
 *
 *    Given a list of non-negative integers, return a list of those numbers except omitting any that end
 *    with 9. (Note: % by 10)
 *
 *  Tests:
 *    no9([1, 2, 19]) ? [1, 2]
 *    no9([9, 19, 29, 3]) ? [3]
 *    no9([1, 2, 3]) ? [1, 2, 3]
 *    no9([45, 99, 90, 28, 13, 999, 0]) ? [45, 90, 28, 13, 0]
 *    no9([]) ? []
 *    no9([9]) ? []
 *    no9([0, 9, 0]) ? [0, 0]
 *    other tests
 */
public class No9 {
  public List<Integer> no9(List<Integer> nums) {
    nums.removeIf(n -> n % 10 == 9);
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
