/*
 *  Recursion-1 --> changePi
 *
 *    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been
 *    replaced by "3.14".
 *
 *  Tests:
 *    changePi("xpix") ? "x3.14x"
 *    changePi("pipi") ? "3.143.14"
 *    changePi("pip") ? "3.14p"
 *    changePi("pi") ? "3.14"
 *    changePi("hip") ? "hip"
 *    changePi("p") ? "p"
 *    changePi("x") ? "x"
 *    changePi("") ? ""
 *    changePi("pixx") ? "3.14xx"
 *    changePi("xyzzy") ? "xyzzy"
 *    other tests
 */
public class ChangePi {
  public String changePi(String str) {
    if (str.indexOf("pi") > -1) {
      return changePi(
          str.substring(0, str.indexOf("pi")) + "3.14" + str.substring(str.indexOf("pi") + 2));
    }
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
