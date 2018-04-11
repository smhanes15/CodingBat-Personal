/*
 *  Warmup-2 --> frontTimes
 *
 *    Given a string and a non-negative int n, we'll say that the front of the string is the first 3
 *    chars, or whatever is there if the string is less than length 3. Return n copies of the front;
 *
 *  Tests:
 *    frontTimes("Chocolate", 2) ? "ChoCho"
 *    frontTimes("Chocolate", 3) ? "ChoChoCho"
 *    frontTimes("Abc", 3) ? "AbcAbcAbc"
 *    frontTimes("Ab", 4) ? "AbAbAbAb"
 *    frontTimes("A", 4) ? "AAAA"
 *    frontTimes("", 4) ? ""
 *    frontTimes("Abc", 0) ? ""
 */
public class FrontTimes {
  public String frontTimes(String str, int n) {
    String result = "";
    for (int x = n; x > 0; x--) {
      if (str.length() > 3) result += str.substring(0, 3);
      else {
        result += str.substring(0, str.length());
      }
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
