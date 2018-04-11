/*
 *  Map-2 --> pairs
 *
 *    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each
 *    string add its first character as a key with its last character as the value.
 *
 *  Tests:
 *    pairs(["code", "bug"]) ? {"b": "g", "c": "e"}
 *    pairs(["man", "moon", "main"]) ? {"m": "n"}
 *    pairs(["man", "moon", "good", "night"]) ? {"g": "d", "m": "n", "n": "t"}
 *    pairs([]) ? {}
 *    pairs(["a", "b"]) ? {"a": "a", "b": "b"}
 *    pairs(["are", "codes", "and", "cods"]) ? {"a": "d", "c": "s"}
 *    pairs(["apple", "banana", "tea", "coffee"]) ? {"a": "e", "b": "a", "c": "e", "t": "a"}
 *    other tests
 */
public class Pairs {
  public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap();
    for (String s : strings) {
      map.put(s.substring(0, 1), s.substring(s.length() - 1));
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
