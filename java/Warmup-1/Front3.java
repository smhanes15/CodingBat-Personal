/*
 *  Warmup-1 --> front3
 *
 *    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is
 *    less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 *
 *  Tests:
 *    front3("Java") ? "JavJavJav"
 *    front3("Chocolate") ? "ChoChoCho"
 *    front3("abc") ? "abcabcabc"
 *    front3("abcXYZ") ? "abcabcabc"
 *    front3("ab") ? "ababab"
 *    front3("a") ? "aaa"
 *    front3("") ? ""
 */
public class Front3 {
  public String front3(String str) {
    int l = (str.length() < 3) ? str.length() : 3;
    return str.substring(0, l) + str.substring(0, l) + str.substring(0, l);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
