/*
 *  AP-1 --> hasOne
 *
 *    Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost
 *    digit, and / to discard the rightmost digit.
 *
 *  Tests:
 *    hasOne(10) ? true
 *    hasOne(22) ? false
 *    hasOne(220) ? false
 *    hasOne(212) ? true
 *    hasOne(1) ? true
 *    hasOne(9) ? false
 *    hasOne(211112) ? true
 *    hasOne(121121) ? true
 *    hasOne(222222) ? false
 *    hasOne(56156) ? true
 *    hasOne(56556) ? false
 *    other tests
 */
public class HasOne {
  public boolean hasOne(int n) {
    String str = Integer.toString(n);
    for (int x = 0; x < str.length(); x++) {
      if (str.charAt(x) == '1') {
        return true;
      }
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
