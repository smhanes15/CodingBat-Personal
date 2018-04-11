/*
 *  String-1 --> without2
 *
 *    Given a string, if a length 2 substring appears at both its beginning and end, return a string
 *    without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with
 *    itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 *
 *  Tests:
 *    without2("HelloHe") ? "lloHe"
 *    without2("HelloHi") ? "HelloHi"
 *    without2("Hi") ? ""
 *    without2("Chocolate") ? "Chocolate"
 *    without2("xxx") ? "x"
 *    without2("xx") ? ""
 *    without2("x") ? "x"
 *    without2("") ? ""
 *    without2("Fruits") ? "Fruits"
 *    other tests
 */
public class Without2 {
  public String without2(String str) {
    int l = str.length();
    if (l == 1) return str;
    if (l < 3) return "";
    if (str.substring(0, 2).equals(str.substring(l - 2))) return str.substring(2);
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
