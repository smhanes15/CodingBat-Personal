/*
 *  String-2 --> wordEnds
 *
 *    Given a string and a non-empty word string, return a string made of each char just before and just
 *    after every appearance of the word in the string. Ignore cases where there is no char before or
 *    after the word, and a char may be included twice if it is between two words.
 *
 *  Tests:
 *    wordEnds("abcXY123XYijk", "XY") ? "c13i"
 *    wordEnds("XY123XY", "XY") ? "13"
 *    wordEnds("XY1XY", "XY") ? "11"
 *    wordEnds("XYXY", "XY") ? "XY"
 *    wordEnds("XY", "XY") ? ""
 *    wordEnds("Hi", "XY") ? ""
 *    wordEnds("", "XY") ? ""
 *    wordEnds("abc1xyz1i1j", "1") ? "cxziij"
 *    wordEnds("abc1xyz1", "1") ? "cxz"
 *    wordEnds("abc1xyz11", "1") ? "cxz11"
 *    wordEnds("abc1xyz1abc", "abc") ? "11"
 *    wordEnds("abc1xyz1abc", "b") ? "acac"
 *    wordEnds("abc1abc1abc", "abc") ? "1111"
 *    other tests
 */
public class WordEnds {
  public String wordEnds(String str, String word) {
    int s = str.length();
    int w = word.length();
    String newStr = "";
    for (int x = 0; x < s - w + 1; x++) {
      String tmp = str.substring(x, x + w);
      if (x > 0 && tmp.equals(word)) newStr += str.substring(x - 1, x);
      if (x < s - w && tmp.equals(word)) newStr += str.substring(x + w, x + w + 1);
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
