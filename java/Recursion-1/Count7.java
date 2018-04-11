/*
 *  Recursion-1 --> count7
 *
 *    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717
 *    yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
 *    divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 *
 *  Tests:
 *    count7(717) ? 2
 *    count7(7) ? 1
 *    count7(123) ? 0
 *    count7(77) ? 2
 *    count7(7123) ? 1
 *    count7(771237) ? 3
 *    count7(771737) ? 4
 *    count7(47571) ? 2
 *    count7(777777) ? 6
 *    count7(70701277) ? 4
 *    count7(777576197) ? 5
 *    count7(99999) ? 0
 *    count7(99799) ? 1
 *    other tests
 */
public class Count7 {
  public int count7(int n) {
    if (n == 0) return 0;
    return ((n % 10 == 7) ? 1 : 0) + count7(n / 10);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
