/*
 *  String-1 --> conCat
 *
 *    Given two strings, append them together (known as "concatenation") and return the result. However,
 *    if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields
 *    "abcat".
 *
 *  Tests:
 *    conCat("abc", "cat") ? "abcat"
 *    conCat("dog", "cat") ? "dogcat"
 *    conCat("abc", "") ? "abc"
 *    conCat("", "cat") ? "cat"
 *    conCat("pig", "g") ? "pig"
 *    conCat("pig", "doggy") ? "pigdoggy"
 *    other tests
 */
public class ConCat {
  public String conCat(String a, String b) {
    String str = "";
    if (a.length() == 0 || b.length() == 0) return a + b;
    if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
      str = a + b.substring(1);
    } else {
      str = a + b;
    }
    return str;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
