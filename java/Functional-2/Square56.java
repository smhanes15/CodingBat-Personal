/*
 *  Functional-2 --> square56
 *
 *    Given a list of integers, return a list of those numbers squared and the product added to 10,
 *    omitting any of the resulting numbers that end in 5 or 6.
 *
 *  Tests:
 *    square56([3, 1, 4]) ? [19, 11]
 *    square56([1]) ? [11]
 *    square56([2]) ? [14]
 *    square56([3]) ? [19]
 *    square56([4]) ? []
 *    square56([5]) ? []
 *    square56([6]) ? []
 *    square56([7]) ? [59]
 *    square56([1, 2, 3, 4, 5, 6, 7]) ? [11, 14, 19, 59]
 *    square56([3, -1, -4, 1, 5, 9]) ? [19, 11, 11, 91]
 *    other tests
 */
public class Square56 {
  public List<Integer> square56(List<Integer> nums) {
    return nums.stream()
        .map(num -> num * num + 10)
        .filter(num -> (num % 10 != 5) && (num % 10 != 6))
        .collect(Collectors.toList());
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
