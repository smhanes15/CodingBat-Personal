/*
 *  String-1 --> hasBad
 *
 *    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with
 *    "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use
 *    .equals() to compare 2 strings.
 *
 *  Tests:
 *    hasBad("badxx") ? true
 *    hasBad("xbadxx") ? true
 *    hasBad("xxbadxx") ? false
 *    hasBad("code") ? false
 *    hasBad("bad") ? true
 *    hasBad("ba") ? false
 *    hasBad("xba") ? false
 *    hasBad("xbad") ? true
 *    hasBad("") ? false
 *    hasBad("badyy") ? true
 *    other tests
 */
public class HasBad {
  public boolean hasBad(String str) {
    return (str.indexOf("bad") == 0 || str.indexOf("bad") == 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
