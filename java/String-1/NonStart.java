/*
 *  String-1 --> nonStart
 *
 *    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be
 *    at least length 1.
 *
 *  Tests:
 *    nonStart("Hello", "There") ? "ellohere"
 *    nonStart("java", "code") ? "avaode"
 *    nonStart("shotl", "java") ? "hotlava"
 *    nonStart("ab", "xy") ? "by"
 *    nonStart("ab", "x") ? "b"
 *    nonStart("x", "ac") ? "c"
 *    nonStart("a", "x") ? ""
 *    nonStart("kit", "kat") ? "itat"
 *    nonStart("mart", "dart") ? "artart"
 *    other tests
 */
public class NonStart {
  public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
