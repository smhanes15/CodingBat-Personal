/*
 *  String-1 --> comboString
 *
 *    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on
 *    the outside and the longer string on the inside. The strings will not be the same length, but they
 *    may be empty (length 0).
 *
 *  Tests:
 *    comboString("Hello", "hi") ? "hiHellohi"
 *    comboString("hi", "Hello") ? "hiHellohi"
 *    comboString("aaa", "b") ? "baaab"
 *    comboString("b", "aaa") ? "baaab"
 *    comboString("aaa", "") ? "aaa"
 *    comboString("", "bb") ? "bb"
 *    comboString("aaa", "1234") ? "aaa1234aaa"
 *    comboString("aaa", "bb") ? "bbaaabb"
 *    comboString("a", "bb") ? "abba"
 *    comboString("bb", "a") ? "abba"
 *    comboString("xyz", "ab") ? "abxyzab"
 *    other tests
 */
public class ComboString {
  public String comboString(String a, String b) {
    return (a.length() > b.length()) ? b + a + b : a + b + a;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
