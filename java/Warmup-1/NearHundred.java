/*
 *  Warmup-1 --> nearHundred
 *
 *    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the
 *    absolute value of a number.
 *
 *  Tests:
 *    nearHundred(93) ? true
 *    nearHundred(90) ? true
 *    nearHundred(89) ? false
 *    nearHundred(110) ? true
 *    nearHundred(111) ? false
 *    nearHundred(121) ? false
 *    nearHundred(-101) ? false
 *    nearHundred(-209) ? false
 *    nearHundred(190) ? true
 *    nearHundred(209) ? true
 *    nearHundred(0) ? false
 *    nearHundred(5) ? false
 *    nearHundred(-50) ? false
 *    nearHundred(191) ? true
 *    nearHundred(189) ? false
 *    nearHundred(200) ? true
 *    nearHundred(210) ? true
 *    nearHundred(211) ? false
 *    nearHundred(290) ? false
 */
public class NearHundred {
  public boolean nearHundred(int n) {
    if (n > 189 && n < 211) return true;
    if (n > 89 && n < 111) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
