/*
 *  Warmup-1 --> makes10
 *
 *    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 *
 *  Tests:
 *    makes10(9, 10) ? true
 *    makes10(9, 9) ? false
 *    makes10(1, 9) ? true
 *    makes10(10, 1) ? true
 *    makes10(10, 10) ? true
 *    makes10(8, 2) ? true
 *    makes10(8, 3) ? false
 *    makes10(10, 42) ? true
 *    makes10(12, -2) ? true
 */
public class Makes10 {
  public boolean makes10(int a, int b) {
    if (a == 10 || b == 10) {
      return true;
    }
    if (a + b == 10) {
      return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
