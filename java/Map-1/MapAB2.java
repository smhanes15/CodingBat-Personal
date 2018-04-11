/*
 *  Map-1 --> mapAB2
 *
 *    Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have
 *    equal values, remove them both.
 *
 *  Tests:
 *    mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) ? {"c": "cake"}
 *    mapAB2({"a": "aaa", "b": "bbb"}) ? {"a": "aaa", "b": "bbb"}
 *    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) ? {"a": "aaa", "b": "bbb", "c": "aaa"}
 *    mapAB2({"a": "aaa"}) ? {"a": "aaa"}
 *    mapAB2({"b": "bbb"}) ? {"b": "bbb"}
 *    mapAB2({"a": "", "b": "", "c": "ccc"}) ? {"c": "ccc"}
 *    mapAB2({}) ? {}
 *    mapAB2({"a": "a", "b": "b", "z": "zebra"}) ? {"a": "a", "b": "b", "z": "zebra"}
 *    other tests
 */
public class MapAB2 {
  public Map<String, String> mapAB2(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
      if (map.get("a").equals(map.get("b"))) {
        map.remove("a");
        map.remove("b");
      }
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
