/*
 *  Functional-2 --> two2
 *
 *    Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any
 *    of the resulting numbers that end in 2.
 *
 *  Tests:
 *    two2([1, 2, 3]) ? [4, 6]
 *    two2([2, 6, 11]) ? [4]
 *    two2([0]) ? [0]
 *    two2([]) ? []
 *    two2([1, 11, 111, 16]) ? []
 *    two2([2, 3, 5, 7, 11]) ? [4, 6, 10, 14]
 *    two2([3, 1, 4, 1, 6, 99, 0]) ? [6, 8, 198, 0]
 *    other tests
 */
public class Two2 {
  public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(n -> n * 2);
    nums.removeIf(n -> n % 10 == 2);
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
