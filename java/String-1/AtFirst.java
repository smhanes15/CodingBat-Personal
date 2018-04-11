/*
 *  String-1 --> atFirst
 *
 *    Given a string, return a string length 2 made of its first 2 chars. If the string length is less
 *    than 2, use '@' for the missing chars.
 *
 *  Tests:
 *    atFirst("hello") ? "he"
 *    atFirst("hi") ? "hi"
 *    atFirst("h") ? "h@"
 *    atFirst("") ? "@@"
 *    atFirst("kitten") ? "ki"
 *    atFirst("java") ? "ja"
 *    atFirst("j") ? "j@"
 *    other tests
 */
public class AtFirst {
  public String atFirst(String str) {
    int l = str.length();
    if (l == 0) return "@@";
    if (l == 1) return str + "@";
    return str.substring(0, 2);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
