/*
 *  String-1 --> withoutEnd
 *
 *    Given a string, return a version without the first and last char, so "Hello" yields "ell". The
 *    string length will be at least 2.
 *
 *  Tests:
 *    withoutEnd("Hello") ? "ell"
 *    withoutEnd("java") ? "av"
 *    withoutEnd("coding") ? "odin"
 *    withoutEnd("code") ? "od"
 *    withoutEnd("ab") ? ""
 *    withoutEnd("Chocolate!") ? "hocolate"
 *    withoutEnd("kitten") ? "itte"
 *    withoutEnd("woohoo") ? "ooho"
 *    other tests
 */
public class WithoutEnd {
  public String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
