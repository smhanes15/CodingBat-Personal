/*
 *  String-1 --> withoutX
 *
 *    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
 *    otherwise return the string unchanged.
 *
 *  Tests:
 *    withoutX("xHix") ? "Hi"
 *    withoutX("xHi") ? "Hi"
 *    withoutX("Hxix") ? "Hxi"
 *    withoutX("Hi") ? "Hi"
 *    withoutX("xxHi") ? "xHi"
 *    withoutX("Hix") ? "Hi"
 *    withoutX("xaxbx") ? "axb"
 *    withoutX("xx") ? ""
 *    withoutX("x") ? ""
 *    withoutX("") ? ""
 *    withoutX("Hello") ? "Hello"
 *    withoutX("Hexllo") ? "Hexllo"
 *    other tests
 */
public class WithoutX {
  public String withoutX(String str) {
    if (str.length() == 0) return str;
    if (str.length() == 1 && str.equals("x")) return "";
    if (str.substring(0, 1).equals("x")) str = str.substring(1);
    if (str.substring(str.length() - 1).equals("x")) str = str.substring(0, str.length() - 1);
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
