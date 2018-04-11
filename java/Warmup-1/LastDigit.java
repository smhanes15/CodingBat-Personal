/*
 *  Warmup-1 --> lastDigit
 *
 *    Given two non-negative int values, return true if they have the same last digit, such as with 27 and
 *    57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 *
 *  Tests:
 *    lastDigit(7, 17) ? true
 *    lastDigit(6, 17) ? false
 *    lastDigit(3, 113) ? true
 *    lastDigit(114, 113) ? false
 *    lastDigit(114, 4) ? true
 *    lastDigit(10, 0) ? true
 *    lastDigit(11, 0) ? false
 */
public class LastDigit {
  public boolean lastDigit(int a, int b) {
    return (a % 5 == b % 5) ? true : false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
