/*
 *  Logic-2 --> evenlySpaced
 *
 *    Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the
 *    three values are evenly spaced, so the difference between small and medium is the same as the
 *    difference between medium and large.
 *
 *  Tests:
 *    evenlySpaced(2, 4, 6) ? true
 *    evenlySpaced(4, 6, 2) ? true
 *    evenlySpaced(4, 6, 3) ? false
 *    evenlySpaced(6, 2, 4) ? true
 *    evenlySpaced(6, 2, 8) ? false
 *    evenlySpaced(2, 2, 2) ? true
 *    evenlySpaced(2, 2, 3) ? false
 *    evenlySpaced(9, 10, 11) ? true
 *    evenlySpaced(10, 9, 11) ? true
 *    evenlySpaced(10, 9, 9) ? false
 *    evenlySpaced(2, 4, 4) ? false
 *    evenlySpaced(2, 2, 4) ? false
 *    evenlySpaced(3, 6, 12) ? false
 *    evenlySpaced(12, 3, 6) ? false
 *    other tests
 */
public class EvenlySpaced {
  public boolean evenlySpaced(int a, int b, int c) {
    int small, medium, large;
    small = Math.min(Math.min(a, b), c);
    large = Math.max(Math.max(a, b), c);
    medium = 0;
    if (small == a) {
      medium = c;
      if (large == c) {
        medium = b;
      }
    }
    if (small == b) {
      if (large == a) {
        medium = c;
      }
      if (large == c) {
        medium = a;
      }
    }
    if (small == c) {
      if (large == a) {
        medium = b;
      }
      if (large == b) {
        medium = a;
      }
    }
    if (Math.abs(small - medium) == Math.abs(medium - large)) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
