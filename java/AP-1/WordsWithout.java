/*
 *  AP-1 --> wordsWithout
 *
 *    Given an array of strings, return a new array without the strings that are equal to the target
 *    string. One approach is to count the occurrences of the target string, make a new array of the
 *    correct length, and then copy over the correct strings.
 *
 *  Tests:
 *    wordsWithout(["a", "b", "c", "a"], "a") ? ["b", "c"]
 *    wordsWithout(["a", "b", "c", "a"], "b") ? ["a", "c", "a"]
 *    wordsWithout(["a", "b", "c", "a"], "c") ? ["a", "b", "a"]
 *    wordsWithout(["b", "c", "a", "a"], "b") ? ["c", "a", "a"]
 *    wordsWithout(["xx", "yyy", "x", "yy", "x"], "x") ? ["xx", "yyy", "yy"]
 *    wordsWithout(["xx", "yyy", "x", "yy", "x"], "yy") ? ["xx", "yyy", "x", "x"]
 *    wordsWithout(["aa", "ab", "ac", "aa"], "aa") ? ["ab", "ac"]
 *    other tests
 */
public class WordsWithout {
  public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    for (int x = 0; x < words.length; x++) {
      if (!words[x].equals(target)) {
        count++;
      }
    }
    String[] new_words = new String[count];
    for (int x = 0, y = 0; x < words.length; x++) {
      if (!words[x].equals(target)) {
        new_words[y] = words[x];
        y++;
      }
    }
    return new_words;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
