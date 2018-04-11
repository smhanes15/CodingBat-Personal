/*
 *  Recursion-1 --> noX
 *
 *    Given a string, compute recursively a new string where all the 'x' chars have been removed.
 *
 *  Tests:
 *    noX("xaxb") ? "ab"
 *    noX("abc") ? "abc"
 *    noX("xx") ? ""
 *    noX("") ? ""
 *    noX("axxbxx") ? "ab"
 *    noX("Hellox") ? "Hello"
 *    other tests
 */
public class NoX {
  public String noX(String str) {
    if (str.indexOf('x') > -1) {
      return noX(str.substring(0, str.indexOf('x')) + str.substring(str.indexOf('x') + 1));
    }
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
