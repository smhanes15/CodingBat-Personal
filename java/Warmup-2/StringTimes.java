/*
 *  Warmup-2 --> stringTimes
 *
 *    Given a string and a non-negative int n, return a larger string that is n copies of the original
 *    string.
 *
 *  Tests:
 *    stringTimes("Hi", 2) ? "HiHi"
 *    stringTimes("Hi", 3) ? "HiHiHi"
 *    stringTimes("Hi", 1) ? "Hi"
 *    stringTimes("Hi", 0) ? ""
 *    stringTimes("Hi", 5) ? "HiHiHiHiHi"
 *    stringTimes("Oh Boy!", 2) ? "Oh Boy!Oh Boy!"
 *    stringTimes("x", 4) ? "xxxx"
 *    stringTimes("", 4) ? ""
 *    stringTimes("code", 2) ? "codecode"
 *    stringTimes("code", 3) ? "codecodecode"
 */
public class StringTimes {
  public String stringTimes(String str, int n) {
    String newStr = "";
    for (int x = 0; x < n; x++) {
      newStr += str;
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
