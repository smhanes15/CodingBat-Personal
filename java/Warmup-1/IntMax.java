/*
 *  Warmup-1 --> intMax
 *
 *    Given three int values, a b c, return the largest.
 *
 *  Tests:
 *    intMax(1, 2, 3) ? 3
 *    intMax(1, 3, 2) ? 3
 *    intMax(3, 2, 1) ? 3
 *    intMax(9, 3, 3) ? 9
 *    intMax(3, 9, 3) ? 9
 *    intMax(3, 3, 9) ? 9
 *    intMax(8, 2, 3) ? 8
 *    intMax(-3, -1, -2) ? -1
 *    intMax(6, 2, 5) ? 6
 *    intMax(5, 6, 2) ? 6
 *    intMax(5, 2, 6) ? 6
 */
public class IntMax {
  public int intMax(int a, int b, int c) {
    return (Math.max(a, Math.max(b, c)));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
