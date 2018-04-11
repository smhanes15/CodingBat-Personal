/*
 *  Map-2 --> wordCount
 *
 *    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a
 *    key for each different string, with the value the number of times that string appears in the array.
 *
 *  Tests:
 *    wordCount(["a", "b", "a", "c", "b"]) ? {"a": 2, "b": 2, "c": 1}
 *    wordCount(["c", "b", "a"]) ? {"a": 1, "b": 1, "c": 1}
 *    wordCount(["c", "c", "c", "c"]) ? {"c": 4}
 *    wordCount([]) ? {}
 *    wordCount(["this", "and", "this", ""]) ? {"": 1, "and": 1, "this": 2}
 *    wordCount(["x", "y", "x", "Y", "X"]) ? {"x": 2, "X": 1, "y": 1, "Y": 1}
 *    wordCount(["123", "0", "123", "1"]) ? {"0": 1, "1": 1, "123": 2}
 *    wordCount(["d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"]) ? {"a": 4, "b": 5, "d": 3, "e": 1, "f": 1, "one": 1, "x": 2, "z": 2, "two": 2}
 *    wordCount(["apple", "banana", "apple", "apple", "tea", "coffee", "banana"]) ? {"banana": 2, "apple": 3, "tea": 1, "coffee": 1}
 *    other tests
 */
public class WordCount {
  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s : strings) {
      if (map.containsKey(s)) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
