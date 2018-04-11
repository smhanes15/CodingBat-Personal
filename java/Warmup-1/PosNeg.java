/*
 *  Warmup-1 --> posNeg
 *
 *    Given 2 int values, return true if one is negative and one is positive. Except if the parameter
 *    "negative" is true, then return true only if both are negative.
 *
 *  Tests:
 *    posNeg(1, -1, false) ? true
 *    posNeg(-1, 1, false) ? true
 *    posNeg(-4, -5, true) ? true
 *    posNeg(-4, -5, false) ? false
 *    posNeg(-4, 5, false) ? true
 *    posNeg(-4, 5, true) ? false
 *    posNeg(1, 1, false) ? false
 *    posNeg(-1, -1, false) ? false
 *    posNeg(1, -1, true) ? false
 *    posNeg(-1, 1, true) ? false
 *    posNeg(1, 1, true) ? false
 *    posNeg(-1, -1, true) ? true
 *    posNeg(5, -5, false) ? true
 *    posNeg(-6, 6, false) ? true
 *    posNeg(-5, -6, false) ? false
 *    posNeg(-2, -1, false) ? false
 *    posNeg(1, 2, false) ? false
 *    posNeg(-5, 6, true) ? false
 *    posNeg(-5, -5, true) ? true
 */
public class PosNeg {
  public boolean posNeg(int a, int b, boolean negative) {
    if (!negative) {
      if ((a < 0) && (b >= 0)) return true;
      if ((a >= 0) && (b < 0)) return true;
    } else if ((a < 0) && (b < 0)) {
      return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
