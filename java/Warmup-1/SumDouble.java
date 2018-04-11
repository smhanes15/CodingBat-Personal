/*
 *  Warmup-1 --> sumDouble
 *
 *    Given two int values, return their sum. Unless the two values are the same, then return double their
 *    sum.
 *
 *  Tests:
 *    sumDouble(1, 2) ? 3
 *    sumDouble(3, 2) ? 5
 *    sumDouble(2, 2) ? 8
 *    sumDouble(-1, 0) ? -1
 *    sumDouble(3, 3) ? 12
 *    sumDouble(0, 0) ? 0
 *    sumDouble(0, 1) ? 1
 *    sumDouble(3, 4) ? 7
 */
public class SumDouble {
  public int sumDouble(int a, int b) {
    if (a != b) return a + b;
    return 2 * (a + b);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
