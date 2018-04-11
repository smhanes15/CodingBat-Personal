/*
 *  String-3 --> countTriple
 *
 *    We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of
 *    triples in the given string. The triples may overlap.
 *
 *  Tests:
 *    countTriple("abcXXXabc") ? 1
 *    countTriple("xxxabyyyycd") ? 3
 *    countTriple("a") ? 0
 *    countTriple("") ? 0
 *    countTriple("XXXabc") ? 1
 *    countTriple("XXXXabc") ? 2
 *    countTriple("XXXXXabc") ? 3
 *    countTriple("222abyyycdXXX") ? 3
 *    countTriple("abYYYabXXXXXab") ? 4
 *    countTriple("abYYXabXXYXXab") ? 0
 *    countTriple("abYYXabXXYXXab") ? 0
 *    countTriple("122abhhh2") ? 1
 *    other tests
 */
public class CountTriple {
  public int countTriple(String str) {
    int c = 0;
    for (int x = 0; x < str.length() - 2; x++) {
      if (str.charAt(x) == str.charAt(x + 1) && str.charAt(x) == str.charAt(x + 2)) c++;
    }
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
