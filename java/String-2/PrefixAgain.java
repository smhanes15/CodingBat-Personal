/*
 *  String-2 --> prefixAgain
 *
 *    Given a string, consider the prefix string made of the first N chars of the string. Does that prefix
 *    string appear somewhere else in the string? Assume that the string is not empty and that N is in the
 *    range 1..str.length().
 *
 *  Tests:
 *    prefixAgain("abXYabc", 1) ? true
 *    prefixAgain("abXYabc", 2) ? true
 *    prefixAgain("abXYabc", 3) ? false
 *    prefixAgain("xyzxyxyxy", 2) ? true
 *    prefixAgain("xyzxyxyxy", 3) ? false
 *    prefixAgain("Hi12345Hi6789Hi10", 1) ? true
 *    prefixAgain("Hi12345Hi6789Hi10", 2) ? true
 *    prefixAgain("Hi12345Hi6789Hi10", 3) ? true
 *    prefixAgain("Hi12345Hi6789Hi10", 4) ? false
 *    prefixAgain("a", 1) ? false
 *    prefixAgain("aa", 1) ? true
 *    prefixAgain("ab", 1) ? false
 *    other tests
 */
public class PrefixAgain {
  public boolean prefixAgain(String str, int n) {
    return (str.indexOf(str.substring(0, n)) < str.lastIndexOf(str.substring(0, n)));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
