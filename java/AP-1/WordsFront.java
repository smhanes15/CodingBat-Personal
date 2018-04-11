/*
 *  AP-1 --> wordsFront
 *
 *    Given an array of strings, return a new array containing the first N strings. N will be in the range
 *    1..length.
 *
 *  Tests:
 *    wordsFront(["a", "b", "c", "d"], 1) ? ["a"]
 *    wordsFront(["a", "b", "c", "d"], 2) ? ["a", "b"]
 *    wordsFront(["a", "b", "c", "d"], 3) ? ["a", "b", "c"]
 *    wordsFront(["a", "b", "c", "d"], 4) ? ["a", "b", "c", "d"]
 *    wordsFront(["Hi", "There"], 1) ? ["Hi"]
 *    wordsFront(["Hi", "There"], 2) ? ["Hi", "There"]
 */
public class WordsFront {
  public String[] wordsFront(String[] words, int n) {
    String newStr[] = new String[n];
    for (int x = 0; x < n; x++) {
      newStr[x] = words[x];
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
