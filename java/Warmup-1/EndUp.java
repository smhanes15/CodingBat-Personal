/*
 *  Warmup-1 --> endUp
 *
 *    Given a string, return a new string where the last 3 chars are now in upper case. If the string has
 *    less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase
 *    version of a string.
 *
 *  Tests:
 *    endUp("Hello") ? "HeLLO"
 *    endUp("hi there") ? "hi thERE"
 *    endUp("hi") ? "HI"
 *    endUp("woo hoo") ? "woo HOO"
 *    endUp("xyz12") ? "xyZ12"
 *    endUp("x") ? "X"
 *    endUp("") ? ""
 */
public class EndUp {
  public String endUp(String str) {
    if (str.length() < 4) return str.toUpperCase();
    return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
