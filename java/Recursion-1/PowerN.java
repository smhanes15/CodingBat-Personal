/*
 *  Recursion-1 --> powerN
 *
 *    Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n
 *    power, so powerN(3, 2) is 9 (3 squared).
 *
 *  Tests:
 *    powerN(3, 1) ? 3
 *    powerN(3, 2) ? 9
 *    powerN(3, 3) ? 27
 *    powerN(2, 1) ? 2
 *    powerN(2, 2) ? 4
 *    powerN(2, 3) ? 8
 *    powerN(2, 4) ? 16
 *    powerN(2, 5) ? 32
 *    powerN(10, 1) ? 10
 *    powerN(10, 2) ? 100
 *    powerN(10, 3) ? 1000
 *    other tests
 */
public class PowerN {
  public int powerN(int base, int n) {
    if (n == 0) return 1;
    return base * powerN(base, n - 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
