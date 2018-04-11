/*
 *  Map-2 --> word0
 *
 *    Given an array of strings, return a Map<String, Integer> containing a key for every different string
 *    in the array, always with the value 0. For example the string "hello" makes the pair "hello":0.
 *    We'll do more complicated counting later, but for this problem the value is simply 0.
 *
 *  Tests:
 *    word0(["a", "b", "a", "b"]) ? {"a": 0, "b": 0}
 *    word0(["a", "b", "a", "c", "b"]) ? {"a": 0, "b": 0, "c": 0}
 *    word0(["c", "b", "a"]) ? {"a": 0, "b": 0, "c": 0}
 *    word0(["c", "c", "c", "c"]) ? {"c": 0}
 *    word0([]) ? {}
 *    other tests
 */
public class Word0 {
  public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s : strings) {
      map.put(s, 0);
    }
    return map;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
