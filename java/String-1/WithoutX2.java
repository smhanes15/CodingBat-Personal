/*
 *  String-1 --> withoutX2
 *
 *    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x'
 *    chars, and otherwise return the string unchanged. This is a little harder than it looks.
 *
 *  Tests:
 *    withoutX2("xHi") ? "Hi"
 *    withoutX2("Hxi") ? "Hi"
 *    withoutX2("Hi") ? "Hi"
 *    withoutX2("xxHi") ? "Hi"
 *    withoutX2("Hix") ? "Hix"
 *    withoutX2("xaxb") ? "axb"
 *    withoutX2("xx") ? ""
 *    withoutX2("x") ? ""
 *    withoutX2("") ? ""
 *    withoutX2("Hello") ? "Hello"
 *    withoutX2("Hexllo") ? "Hexllo"
 *    withoutX2("xHxllo") ? "Hxllo"
 *    other tests
 */
public class WithoutX2 {
  public String withoutX2(String str) {
    if (str.length() < 1) {
      return str;
    }
    if (str.substring(0, 1).equals("x")) {
      if (str.length() > 1 && str.substring(1, 2).equals("x")) {
        return str.substring(2);
      }
      return str.substring(1);
    }
    if (str.length() > 1 && str.substring(1, 2).equals("x")) {
      return str.substring(0, 1) + str.substring(2);
    }
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
