/*
 *  Map-2 --> wordLen
 *
 *    Given an array of strings, return a Map<String, Integer> containing a key for every different string
 *    in the array, and the value is that string's length.
 *
 *  Tests:
 *    wordLen(["a", "bb", "a", "bb"]) ? {"bb": 2, "a": 1}
 *    wordLen(["this", "and", "that", "and"]) ? {"that": 4, "and": 3, "this": 4}
 *    wordLen(["code", "code", "code", "bug"]) ? {"code": 4, "bug": 3}
 *    wordLen([]) ? {}
 *    wordLen(["z"]) ? {"z": 1}
 *    other tests
 */
public class WordLen {
  public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s : strings) {
      map.put(s, s.length());
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
