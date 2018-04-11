/*
 *  String-2 --> mixString
 *
 *    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
 *    the second char of a, the second char of b, and so on. Any leftover chars go at the end of the
 *    result.
 *
 *  Tests:
 *    mixString("abc", "xyz") ? "axbycz"
 *    mixString("Hi", "There") ? "HTihere"
 *    mixString("xxxx", "There") ? "xTxhxexre"
 *    mixString("xxx", "X") ? "xXxx"
 *    mixString("2/", "27 around") ? "22/7 around"
 *    mixString("", "Hello") ? "Hello"
 *    mixString("Abc", "") ? "Abc"
 *    mixString("", "") ? ""
 *    mixString("a", "b") ? "ab"
 *    mixString("ax", "b") ? "abx"
 *    mixString("a", "bx") ? "abx"
 *    mixString("So", "Long") ? "SLoong"
 *    mixString("Long", "So") ? "LSoong"
 *    other tests
 */
public class MixString {
  public String mixString(String a, String b) {
    String c = "";
    int min = Math.min(a.length(), b.length());
    for (int x = 0; x < min; x++) {
      c += a.substring(x, x + 1) + b.substring(x, x + 1);
    }
    c += (a.length() > b.length()) ? a.substring(min) : b.substring(min);
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
