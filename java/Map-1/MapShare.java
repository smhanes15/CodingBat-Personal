/*
 *  Map-1 --> mapShare
 *
 *    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that
 *    same value. In all cases remove the key "c", leaving the rest of the map unchanged.
 *
 *  Tests:
 *    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) ? {"a": "aaa", "b": "aaa"}
 *    mapShare({"b": "xyz", "c": "ccc"}) ? {"b": "xyz"}
 *    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) ? {"a": "aaa", "b": "aaa", "d": "hi"}
 *    mapShare({"a": "xyz", "b": "1234", "c": "yo", "z": "zzz"}) ? {"a": "xyz", "b": "xyz", "z": "zzz"}
 *    mapShare({"a": "xyz", "b": "1234", "c": "yo", "d": "ddd", "e": "everything"}) ? {"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"}
 *    other tests
 */
public class MapShare {
  public Map<String, String> mapShare(Map<String, String> map) {
    if (map.containsKey("a")) map.put("b", map.get("a"));
    if (map.containsKey("c")) map.remove("c");
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
