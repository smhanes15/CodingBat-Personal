/*
 *  Warmup-1 --> frontBack
 *
 *    Given a string, return a new string where the first and last chars have been exchanged.
 *
 *  Tests:
 *    frontBack("code") ? "eodc"
 *    frontBack("a") ? "a"
 *    frontBack("ab") ? "ba"
 *    frontBack("abc") ? "cba"
 *    frontBack("") ? ""
 *    frontBack("Chocolate") ? "ehocolatC"
 *    frontBack("aavJ") ? "Java"
 *    frontBack("hello") ? "oellh"
 */
public class FrontBack {
  public String frontBack(String str) {
    if (str.length() < 2) {
      return str;
    }
    String first = str.substring(0, 1);
    String last = str.substring(str.length() - 1);
    String mid = str.substring(1, str.length() - 1);
    return last + mid + first;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
