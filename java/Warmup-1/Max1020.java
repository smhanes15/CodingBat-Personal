/*
 *  Warmup-1 --> max1020
 *
 *    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
 *    return 0 if neither is in that range.
 *
 *  Tests:
 *    max1020(11, 19) ? 19
 *    max1020(19, 11) ? 19
 *    max1020(11, 9) ? 11
 *    max1020(9, 21) ? 0
 *    max1020(10, 21) ? 10
 *    max1020(21, 10) ? 10
 *    max1020(9, 11) ? 11
 *    max1020(23, 10) ? 10
 *    max1020(20, 10) ? 20
 *    max1020(7, 20) ? 20
 *    max1020(17, 16) ? 17
 */
public class Max1020 {
  public int max1020(int a, int b) {
    boolean a1020 = false;
    boolean b1020 = false;
    if (a > 9 && a < 21) {
      a1020 = true;
    }
    if (b > 9 && b < 21) {
      b1020 = true;
    }
    if (a1020 && b1020) {
      return Math.max(a, b);
    }
    if (a1020) {
      return a;
    }
    if (b1020) {
      return b;
    }
    return 0;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
