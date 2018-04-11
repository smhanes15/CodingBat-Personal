/*
 *  Map-1 --> mapAB4
 *
 *    Modify and return the given map as follows: if the keys "a" and "b" have values that have different
 *    lengths, then set "c" to have the longer value. If the values exist and have the same length, change
 *    them both to the empty string in the map.
 *
 *  Tests:
 *    mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) ? {"a": "aaa", "b": "bb", "c": "aaa"}
 *    mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) ? {"a": "aa", "b": "bbb", "c": "bbb"}
 *    mapAB4({"a": "aa", "b": "bbb"}) ? {"a": "aa", "b": "bbb", "c": "bbb"}
 *    mapAB4({"a": "aaa"}) ? {"a": "aaa"}
 *    mapAB4({"b": "bbb"}) ? {"b": "bbb"}
 *    mapAB4({"a": "aaa", "b": "bbb", "c": "cake"}) ? {"a": "", "b": "", "c": "cake"}
 *    mapAB4({"a": "a", "b": "b", "c": "cake"}) ? {"a": "", "b": "", "c": "cake"}
 *    mapAB4({"a": "", "b": "b", "c": "cake"}) ? {"a": "", "b": "b", "c": "b"}
 *    mapAB4({"a": "a", "b": "", "c": "cake"}) ? {"a": "a", "b": "", "c": "a"}
 *    mapAB4({"c": "cat", "d": "dog"}) ? {"c": "cat", "d": "dog"}
 *    mapAB4({"ccc": "ccc"}) ? {"ccc": "ccc"}
 *    mapAB4({"c": "a", "d": "b"}) ? {"c": "a", "d": "b"}
 *    mapAB4({}) ? {}
 *    mapAB4({"a": "", "z": "z"}) ? {"a": "", "z": "z"}
 *    mapAB4({"b": "", "z": "z"}) ? {"b": "", "z": "z"}
 *    other tests
 */
public class MapAB4 {
  public Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
      int a = map.get("a").length();
      int b = map.get("b").length();
      if (a == b) {
        map.put("a", "");
        map.put("b", "");
      } else if (a > b) {
        map.put("c", map.get("a"));
      } else {
        map.put("c", map.get("b"));
      }
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
