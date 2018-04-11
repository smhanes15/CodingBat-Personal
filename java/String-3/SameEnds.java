/*
 *  String-3 --> sameEnds
 *
 *    Given a string, return the longest substring that appears at both the beginning and end of the
 *    string without overlapping. For example, sameEnds("abXab") is "ab".
 *
 *  Tests:
 *    sameEnds("abXYab") ? "ab"
 *    sameEnds("xx") ? "x"
 *    sameEnds("xxx") ? "x"
 *    sameEnds("xxxx") ? "xx"
 *    sameEnds("javaXYZjava") ? "java"
 *    sameEnds("javajava") ? "java"
 *    sameEnds("xavaXYZjava") ? ""
 *    sameEnds("Hello! and Hello!") ? "Hello!"
 *    sameEnds("x") ? ""
 *    sameEnds("") ? ""
 *    sameEnds("abcb") ? ""
 *    sameEnds("mymmy") ? "my"
 *    other tests
 */
public class SameEnds {
  public String sameEnds(String string) {
    String result = "";
    int len = string.length();
    for (int x = 0; x <= len / 2; x++) {
      for (int y = len / 2; y < len; y++) {
        if (string.substring(0, x).equals(string.substring(y))) {
          result = string.substring(0, x);
        }
      }
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
