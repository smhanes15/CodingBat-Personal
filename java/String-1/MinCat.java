/*
 *  String-1 --> minCat
 *
 *    Given two strings, append them together (known as "concatenation") and return the result. However,
 *    if the strings are different lengths, omit chars from the longer string so it is the same length as
 *    the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 *
 *  Tests:
 *    minCat("Hello", "Hi") ? "loHi"
 *    minCat("Hello", "java") ? "ellojava"
 *    minCat("java", "Hello") ? "javaello"
 *    minCat("abc", "x") ? "cx"
 *    minCat("x", "abc") ? "xc"
 *    minCat("abc", "") ? ""
 *    other tests
 */
public class MinCat {
  public String minCat(String a, String b) {
    if (a.length() > b.length()) {
      return a.substring(a.length() - b.length()) + b;
    } else {
      return a + b.substring(b.length() - a.length());
    }
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
