/*
 *  Logic-1 --> nearTen
 *
 *    Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
 *    is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
 *
 *  Tests:
 *    nearTen(12) ? true
 *    nearTen(17) ? false
 *    nearTen(19) ? true
 *    nearTen(31) ? true
 *    nearTen(6) ? false
 *    nearTen(10) ? true
 *    nearTen(11) ? true
 *    nearTen(21) ? true
 *    nearTen(22) ? true
 *    nearTen(23) ? false
 *    nearTen(54) ? false
 *    nearTen(155) ? false
 *    nearTen(158) ? true
 *    nearTen(3) ? false
 *    nearTen(1) ? true
 *    other tests
 */
public class NearTen {
  public boolean nearTen(int num) {
    return (num % 10 < 3 || num % 10 > 7);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
