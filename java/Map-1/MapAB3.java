/*
 *  Map-1 --> mapAB3
 *
 *    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the
 *    map (but not both), set the other to have that same value in the map.
 *
 *  Tests:
 *    mapAB3({"a": "aaa", "c": "cake"}) ? {"a": "aaa", "b": "aaa", "c": "cake"}
 *    mapAB3({"b": "bbb", "c": "cake"}) ? {"a": "bbb", "b": "bbb", "c": "cake"}
 *    mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) ? {"a": "aaa", "b": "bbb", "c": "cake"}
 *    mapAB3({"ccc": "ccc"}) ? {"ccc": "ccc"}
 *    mapAB3({"c": "a", "d": "b"}) ? {"c": "a", "d": "b"}
 *    mapAB3({}) ? {}
 *    mapAB3({"a": ""}) ? {"a": "", "b": ""}
 *    mapAB3({"b": ""}) ? {"a": "", "b": ""}
 *    mapAB3({"a": "", "b": ""}) ? {"a": "", "b": ""}
 *    mapAB3({"aa": "aa", "a": "apple", "z": "zzz"}) ? {"aa": "aa", "a": "apple", "b": "apple", "z": "zzz"}
 *    other tests
 */
public class MapAB3 {
  public Map<String, String> mapAB3(Map<String, String> map) {
    if (map.containsKey("a") && !map.containsKey("b")) {
      map.put("b", map.get("a"));
    } else if (map.containsKey("b") && !map.containsKey("a")) {
      map.put("a", map.get("b"));
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
