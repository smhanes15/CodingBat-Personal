/*
 *  Functional-1 --> square
 *
 *    Given a list of integers, return a list where each integer is multiplied with itself.
 *
 *  Tests:
 *    square([1, 2, 3]) ? [1, 4, 9]
 *    square([6, 8, -6, -8, 1]) ? [36, 64, 36, 64, 1]
 *    square([]) ? []
 *    square([12]) ? [144]
 *    square([5, 10]) ? [25, 100]
 *    square([6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2]) ? [36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4]
 *    other tests
 */
public class Square {
  public List<Integer> square(List<Integer> nums) {
    nums.replaceAll(n -> n * n);
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
