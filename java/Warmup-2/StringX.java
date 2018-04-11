/*
 *  Warmup-2 --> stringX
 *
 *    Given a string, return a version where all the "x" have been removed. Except an "x" at the very
 *    start or end should not be removed.
 *
 *  Tests:
 *    stringX("xxHxix") ? "xHix"
 *    stringX("abxxxcd") ? "abcd"
 *    stringX("xabxxxcdx") ? "xabcdx"
 *    stringX("xKittenx") ? "xKittenx"
 *    stringX("Hello") ? "Hello"
 *    stringX("xx") ? "xx"
 *    stringX("x") ? "x"
 *    stringX("") ? ""
 */
public class StringX {
  public String stringX(String str) {
    if (str.length() < 1) return str;
    String result = "";
    String s = "";
    String e = "";
    int len = str.length();
    s = (str.substring(0, 1).equals("x")) ? "x" : "";
    if (len > 1) {
      e = (str.substring(len - 1).equals("x")) ? "x" : "";
    }
    for (int x = 0; x < len; x++) {
      if (!str.substring(x, x + 1).equals("x")) result += str.substring(x, x + 1);
    }
    return s + result + e;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
