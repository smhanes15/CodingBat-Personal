/*
 *  Logic-1 --> in1To10
 *
 *    Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in
 *    which case return true if the number is less or equal to 1, or greater or equal to 10.
 *
 *  Tests:
 *    in1To10(5, false) ? true
 *    in1To10(11, false) ? false
 *    in1To10(11, true) ? true
 *    in1To10(10, false) ? true
 *    in1To10(10, true) ? true
 *    in1To10(9, false) ? true
 *    in1To10(9, true) ? false
 *    in1To10(1, false) ? true
 *    in1To10(1, true) ? true
 *    in1To10(0, false) ? false
 *    in1To10(0, true) ? true
 *    in1To10(-1, false) ? false
 *    in1To10(-1, true) ? true
 *    in1To10(99, false) ? false
 *    in1To10(-99, true) ? true
 *    other tests
 */
public class In1To10 {
  public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
      return (n < 2 || n > 9);
    } else {
      return (n > 0 && n < 11);
    }
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
