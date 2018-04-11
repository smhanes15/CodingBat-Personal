/*
 *  String-2 --> sameStarChar
 *
 *    Returns true if for every '*' (star) in the string, if there are chars both immediately before and
 *    after the star, they are the same.
 *
 *  Tests:
 *    sameStarChar("xy*yzz") ? true
 *    sameStarChar("xy*zzz") ? false
 *    sameStarChar("*xa*az") ? true
 *    sameStarChar("*xa*bz") ? false
 *    sameStarChar("*xa*a*") ? true
 *    sameStarChar("") ? true
 *    sameStarChar("*xa*a*a") ? true
 *    sameStarChar("*xa*a*b") ? false
 *    sameStarChar("*12*2*2") ? true
 *    sameStarChar("12*2*3*") ? false
 *    sameStarChar("abcDEF") ? true
 *    sameStarChar("XY*YYYY*Z*") ? false
 *    sameStarChar("XY*YYYY*Y*") ? true
 *    sameStarChar("12*2*3*") ? false
 *    sameStarChar("*") ? true
 *    sameStarChar("**") ? true
 *    other tests
 */
public class SameStarChar {
  public boolean sameStarChar(String str) {
    for (int x = 1; x < str.length() - 1; x++) {
      if (str.charAt(x) == '*' && str.charAt(x - 1) != str.charAt(x + 1)) return false;
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
