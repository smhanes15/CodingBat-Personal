/*
 *  Warmup-1 --> diff21
 *
 *    Given an int n, return the absolute difference between n and 21, except return double the absolute
 *    difference if n is over 21.
 *
 *  Tests:
 *    diff21(19) ? 2
 *    diff21(10) ? 11
 *    diff21(21) ? 0
 *    diff21(22) ? 2
 *    diff21(25) ? 8
 *    diff21(30) ? 18
 *    diff21(0) ? 21
 *    diff21(1) ? 20
 *    diff21(2) ? 19
 *    diff21(-1) ? 22
 *    diff21(-2) ? 23
 *    diff21(50) ? 58
 */
public class Diff21 {
  public int diff21(int n) {
    if (n < 21) return Math.abs(n - 21);
    return 2 * Math.abs(n - 21);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
