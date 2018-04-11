/*
 *  Map-2 --> firstChar
 *
 *    Given an array of non-empty strings, return a Map<String, String> with a key for every different
 *    first character seen, with the value of all the strings starting with that character appended
 *    together in the order they appear in the array.
 *
 *  Tests:
 *    firstChar(["salt", "tea", "soda", "toast"]) ? {"s": "saltsoda", "t": "teatoast"}
 *    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) ? {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 *    firstChar([]) ? {}
 *    firstChar(["apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"]) ? {"a": "appleaardvark", "b": "bellsbellsbells", "s": "saltsun", "z": "zen"}
 */
public class FirstChar {
  public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap();
    for (String s : strings) {
      String str = s.substring(0, 1);
      if (!map.containsKey(str)) {
        map.put(str, s);
      } else {
        String newStr = map.get(str);
        map.put(str, newStr + s);
      }
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
