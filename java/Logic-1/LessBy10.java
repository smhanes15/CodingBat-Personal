/*
 *  Logic-1 --> lessBy10
 *
 *    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 *
 *  Tests:
 *    lessBy10(1, 7, 11) ? true
 *    lessBy10(1, 7, 10) ? false
 *    lessBy10(11, 1, 7) ? true
 *    lessBy10(10, 7, 1) ? false
 *    lessBy10(-10, 2, 2) ? true
 *    lessBy10(2, 11, 11) ? false
 *    lessBy10(3, 3, 30) ? true
 *    lessBy10(3, 3, 3) ? false
 *    lessBy10(10, 1, 11) ? true
 *    lessBy10(10, 11, 1) ? true
 *    lessBy10(10, 11, 2) ? false
 *    lessBy10(3, 30, 3) ? true
 *    lessBy10(2, 2, -8) ? true
 *    lessBy10(2, 8, 12) ? true
 *    other tests
 */
public class LessBy10 {
  public boolean lessBy10(int a, int b, int c) {
    return (Math.abs(a - b) > 9 || Math.abs(a - c) > 9 || Math.abs(b - c) > 9);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
