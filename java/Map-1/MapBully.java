/*
 *  Map-1 --> mapBully
 *
 *    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that
 *    value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and
 *    replacing it with the empty string.
 *
 *  Tests:
 *    mapBully({"a": "candy", "b": "dirt"}) ? {"a": "", "b": "candy"}
 *    mapBully({"a": "candy"}) ? {"a": "", "b": "candy"}
 *    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) ? {"a": "", "b": "candy", "c": "meh"}
 *    mapBully({"b": "carrot"}) ? {"b": "carrot"}
 *    mapBully({"c": "meh"}) ? {"c": "meh"}
 *    mapBully({"a": "sparkle", "c": "meh"}) ? {"a": "", "b": "sparkle", "c": "meh"}
 */
public class MapBully {
  public Map<String, String> mapBully(Map<String, String> map) {
    if (map.containsKey("a")) {
      map.put("b", map.get("a"));
      map.put("a", "");
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
