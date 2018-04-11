/*
 *  Warmup-2 --> stringMatch
 *
 *    Given 2 strings, a and b, return the number of the positions where they contain the same length 2
 *    substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in
 *    the same place in both strings.
 *
 *  Tests:
 *    stringMatch("xxcaazz", "xxbaaz") ? 3
 *    stringMatch("abc", "abc") ? 2
 *    stringMatch("abc", "axc") ? 0
 *    stringMatch("hello", "he") ? 1
 *    stringMatch("he", "hello") ? 1
 *    stringMatch("h", "hello") ? 0
 *    stringMatch("", "hello") ? 0
 *    stringMatch("aabbccdd", "abbbxxd") ? 1
 *    stringMatch("aaxxaaxx", "iaxxai") ? 3
 *    stringMatch("iaxxai", "aaxxaaxx") ? 3
 */
public class StringMatch {
  public int stringMatch(String a, String b) {
    int count = 0;
    if ((a.length() < 2) || (b.length() < 2)) return count;
    String small = (a.length() > b.length()) ? b : a;
    String large = (a.length() > b.length()) ? a : b;
    for (int x = 0; x < small.length() - 1; x++) {
      if (small.charAt(x) == large.charAt(x)) {
        if (small.charAt(x + 1) == large.charAt(x + 1)) count++;
      }
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
