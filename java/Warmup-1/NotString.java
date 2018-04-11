/*
 *  Warmup-1 --> notString
 *
 *    Given a string, return a new string where "not " has been added to the front. However, if the string
 *    already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 *
 *  Tests:
 *    notString("candy") ? "not candy"
 *    notString("x") ? "not x"
 *    notString("not bad") ? "not bad"
 *    notString("bad") ? "not bad"
 *    notString("not") ? "not"
 *    notString("is not") ? "not is not"
 *    notString("no") ? "not no"
 */
public class NotString {
  public String notString(String str) {
    int l = str.length();
    if (l > 2 && str.substring(0, 3).equals("not")) {
      return str;
    }
    return "not " + str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
