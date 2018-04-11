/*
 *  String-1 --> twoChar
 *
 *    Given a string and an index, return a string length 2 starting at the given index. If the index is
 *    too big or too small to define a string length 2, use the first 2 chars. The string length will be
 *    at least 2.
 *
 *  Tests:
 *    twoChar("java", 0) ? "ja"
 *    twoChar("java", 2) ? "va"
 *    twoChar("java", 3) ? "ja"
 *    twoChar("java", 4) ? "ja"
 *    twoChar("java", -1) ? "ja"
 *    twoChar("Hello", 0) ? "He"
 *    twoChar("Hello", 1) ? "el"
 *    twoChar("Hello", 99) ? "He"
 *    twoChar("Hello", 3) ? "lo"
 *    twoChar("Hello", 4) ? "He"
 *    twoChar("Hello", 5) ? "He"
 *    twoChar("Hello", -7) ? "He"
 *    twoChar("Hello", 6) ? "He"
 *    twoChar("Hello", -1) ? "He"
 *    twoChar("yay", 0) ? "ya"
 *    other tests
 */
public class TwoChar {
  public String twoChar(String str, int index) {
    if (str.length() <= index + 1 || index < 0) return str.substring(0, 2);
    else return str.substring(index, index + 2);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
