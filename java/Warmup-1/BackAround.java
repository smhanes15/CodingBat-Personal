/*
 *  Warmup-1 --> backAround
 *
 *    Given a string, take the last char and return a new string with the last char added at the front and
 *    back, so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 *  Tests:
 *    backAround("cat") ? "tcatt"
 *    backAround("Hello") ? "oHelloo"
 *    backAround("a") ? "aaa"
 *    backAround("abc") ? "cabcc"
 *    backAround("read") ? "dreadd"
 *    backAround("boo") ? "obooo"
 */
public class BackAround {
  public String backAround(String str) {
    String lastChar = str.substring(str.length() - 1);
    return lastChar + str + lastChar;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
