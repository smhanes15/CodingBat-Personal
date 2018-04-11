/*
 *  String-1 --> lastTwo
 *
 *    Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
 *    so "coding" yields "codign".
 *
 *  Tests:
 *    lastTwo("coding") ? "codign"
 *    lastTwo("cat") ? "cta"
 *    lastTwo("ab") ? "ba"
 *    lastTwo("a") ? "a"
 *    lastTwo("") ? ""
 *    other tests
 */
public class LastTwo {
  public String lastTwo(String str) {
    if (str.length() < 2) return str;
    int l = str.length();
    String last = str.substring(l - 1);
    String first = str.substring(l - 2, l - 1);
    return str.substring(0, l - 2) + last + first;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
