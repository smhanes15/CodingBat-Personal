/*
 *  Map-2 --> wordMultiple
 *
 *    Given an array of strings, return a Map<String, Boolean> where each different string is a key and
 *    its value is true if that string appears 2 or more times in the array.
 *
 *  Tests:
 *    wordMultiple(["a", "b", "a", "c", "b"]) ? {"a": true, "b": true, "c": false}
 *    wordMultiple(["c", "b", "a"]) ? {"a": false, "b": false, "c": false}
 *    wordMultiple(["c", "c", "c", "c"]) ? {"c": true}
 *    wordMultiple([]) ? {}
 *    wordMultiple(["this", "and", "this"]) ? {"and": false, "this": true}
 *    wordMultiple(["d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"]) ? {"a": true, "b": true, "d": true, "e": false, "x": false, "z": true}
 *    other tests
 */
public class WordMultiple {
  public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> map = new HashMap();
    for (String s : strings) {
      if (map.containsKey(s)) map.put(s, true);
      else map.put(s, false);
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
