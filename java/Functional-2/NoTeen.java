/*
 *  Functional-2 --> noTeen
 *
 *    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19
 *    inclusive.
 *
 *  Tests:
 *    noTeen([12, 13, 19, 20]) ? [12, 20]
 *    noTeen([1, 14, 1]) ? [1, 1]
 *    noTeen([15]) ? []
 *    noTeen([-15]) ? [-15]
 *    noTeen([]) ? []
 *    noTeen([0, 1, 2, -3]) ? [0, 1, 2, -3]
 *    noTeen([15, 17, 19, 21, 19]) ? [21]
 *    noTeen([-16, 2, 15, 3, 16, 25]) ? [-16, 2, 3, 25]
 *    other tests
 */
public class NoTeen {
  public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf(n -> (n > 12 && n < 20));
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
