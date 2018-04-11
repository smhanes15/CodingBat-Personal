/*
 *  String-1 --> withouEnd2
 *
 *    Given a string, return a version without both the first and last char of the string. The string may
 *    be any length, including 0.
 *
 *  Tests:
 *    withouEnd2("Hello") ? "ell"
 *    withouEnd2("abc") ? "b"
 *    withouEnd2("ab") ? ""
 *    withouEnd2("a") ? ""
 *    withouEnd2("") ? ""
 *    withouEnd2("coldy") ? "old"
 *    withouEnd2("java code") ? "ava cod"
 *    other tests
 */
public class WithouEnd2 {
  public String withouEnd2(String str) {
    return (str.length() > 2) ? str.substring(1, str.length() - 1) : "";
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
