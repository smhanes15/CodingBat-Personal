/*
 *  String-2 --> repeatSeparator
 *
 *    Given two strings, word and a separator sep, return a big string made of count occurrences of the
 *    word, separated by the separator string.
 *
 *  Tests:
 *    repeatSeparator("Word", "X", 3) ? "WordXWordXWord"
 *    repeatSeparator("This", "And", 2) ? "ThisAndThis"
 *    repeatSeparator("This", "And", 1) ? "This"
 *    repeatSeparator("Hi", "-n-", 2) ? "Hi-n-Hi"
 *    repeatSeparator("AAA", "", 1) ? "AAA"
 *    repeatSeparator("AAA", "", 0) ? ""
 *    repeatSeparator("A", "B", 5) ? "ABABABABA"
 *    repeatSeparator("abc", "XX", 3) ? "abcXXabcXXabc"
 *    repeatSeparator("abc", "XX", 2) ? "abcXXabc"
 *    repeatSeparator("abc", "XX", 1) ? "abc"
 *    repeatSeparator("XYZ", "a", 2) ? "XYZaXYZ"
 *    other tests
 */
public class RepeatSeparator {
  public String repeatSeparator(String word, String sep, int count) {
    String s = "";
    for (int x = 0; x < count; x++) {
      s += word;
      if (x < count - 1) {
        s += sep;
      }
    }
    return s;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
