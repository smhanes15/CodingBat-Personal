/*
 *  Logic-1 --> lastDigit
 *
 *    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints
 *    are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 *
 *  Tests:
 *    lastDigit(23, 19, 13) ? true
 *    lastDigit(23, 19, 12) ? false
 *    lastDigit(23, 19, 3) ? true
 *    lastDigit(23, 19, 39) ? true
 *    lastDigit(1, 2, 3) ? false
 *    lastDigit(1, 1, 2) ? true
 *    lastDigit(1, 2, 2) ? true
 *    lastDigit(14, 25, 43) ? false
 *    lastDigit(14, 25, 45) ? true
 *    lastDigit(248, 106, 1002) ? false
 *    lastDigit(248, 106, 1008) ? true
 *    lastDigit(10, 11, 20) ? true
 *    lastDigit(0, 11, 0) ? true
 *    other tests
 */
public class LastDigit {
  public boolean lastDigit(int a, int b, int c) {
    return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
