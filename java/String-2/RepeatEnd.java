/*
 *  String-2 --> repeatEnd
 *
 *    Given a string and an int n, return a string made of n repetitions of the last n characters of the
 *    string. You may assume that n is between 0 and the length of the string, inclusive.
 *
 *  Tests:
 *    repeatEnd("Hello", 3) ? "llollollo"
 *    repeatEnd("Hello", 2) ? "lolo"
 *    repeatEnd("Hello", 1) ? "o"
 *    repeatEnd("Hello", 0) ? ""
 *    repeatEnd("abc", 3) ? "abcabcabc"
 *    repeatEnd("1234", 2) ? "3434"
 *    repeatEnd("1234", 3) ? "234234234"
 *    repeatEnd("", 0) ? ""
 *    other tests
 */
public class RepeatEnd {
  public String repeatEnd(String str, int n) {
    int l = str.length();
    String r = str.substring(l - n);
    String s = "";
    for (int x = 0; x < n; x++) {
      s += r;
    }
    return s;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
