/*
 *  String-1 --> extraEnd
 *
 *    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The
 *    string length will be at least 2.
 *
 *  Tests:
 *    extraEnd("Hello") ? "lololo"
 *    extraEnd("ab") ? "ababab"
 *    extraEnd("Hi") ? "HiHiHi"
 *    extraEnd("Candy") ? "dydydy"
 *    extraEnd("Code") ? "dedede"
 *    other tests
 */
public class ExtraEnd {
  public String extraEnd(String str) {
    int l = str.length();
    String last = str.substring(l - 2);
    return last + last + last;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
