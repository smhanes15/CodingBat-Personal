/*
 *  String-1 --> extraFront
 *
 *    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 *    The string may be any length. If there are fewer than 2 chars, use whatever is there.
 *
 *  Tests:
 *    extraFront("Hello") ? "HeHeHe"
 *    extraFront("ab") ? "ababab"
 *    extraFront("H") ? "HHH"
 *    extraFront("") ? ""
 *    extraFront("Candy") ? "CaCaCa"
 *    extraFront("Code") ? "CoCoCo"
 *    other tests
 */
public class ExtraFront {
  public String extraFront(String str) {
    if (str.length() < 2) return str + str + str;
    return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
