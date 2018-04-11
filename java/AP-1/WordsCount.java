/*
 *  AP-1 --> wordsCount
 *
 *    Given an array of strings, return the count of the number of strings with the given length.
 *
 *  Tests:
 *    wordsCount(["a", "bb", "b", "ccc"], 1) ? 2
 *    wordsCount(["a", "bb", "b", "ccc"], 3) ? 1
 *    wordsCount(["a", "bb", "b", "ccc"], 4) ? 0
 *    wordsCount(["xx", "yyy", "x", "yy", "z"], 1) ? 2
 *    wordsCount(["xx", "yyy", "x", "yy", "z"], 2) ? 2
 *    wordsCount(["xx", "yyy", "x", "yy", "z"], 3) ? 1
 */
public class WordsCount {
  public int wordsCount(String[] words, int len) {
    int count = 0;
    for (int x = 0; x < words.length; x++) {
      if (words[x].length() == len) count++;
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
