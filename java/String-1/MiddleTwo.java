/*
 *  String-1 --> middleTwo
 *
 *    Given a string of even length, return a string made of the middle two chars, so the string "string"
 *    yields "ri". The string length will be at least 2.
 *
 *  Tests:
 *    middleTwo("string") ? "ri"
 *    middleTwo("code") ? "od"
 *    middleTwo("Practice") ? "ct"
 *    middleTwo("ab") ? "ab"
 *    middleTwo("0123456789") ? "45"
 *    other tests
 */
public class MiddleTwo {
  public String middleTwo(String str) {
    return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
