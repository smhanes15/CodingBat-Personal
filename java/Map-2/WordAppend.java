/*
 *  Map-2 --> wordAppend
 *
 *    Loop over the given array of strings to build a result string like this: when a string appears the
 *    2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if
 *    no string appears a 2nd time.
 *
 *  Tests:
 *    wordAppend(["a", "b", "a"]) ? "a"
 *    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) ? "aa"
 *    wordAppend(["a", "", "a"]) ? "a"
 *    wordAppend([]) ? ""
 *    wordAppend(["a", "b", "b", "a", "a"]) ? "ba"
 *    wordAppend(["a", "b", "b", "b", "a", "c", "a", "a"]) ? "baa"
 *    wordAppend(["a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"]) ? "baaba"
 *    wordAppend(["not", "and", "or", "and", "this", "and", "or", "that", "not"]) ? "andornot"
 *    wordAppend(["a", "b", "c"]) ? ""
 *    wordAppend(["this", "or", "that", "and", "this", "and", "that"]) ? "thisandthat"
 *    wordAppend(["xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"]) ? "xxyyzzxx"
 *    other tests
 */
public class WordAppend {
  public String wordAppend(String[] strings) {
    String result = "";
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String str : strings) {
      if (map.containsKey(str)) {
        map.put(str, map.get(str) + 1);
        if (map.get(str) % 2 == 0) {
          result += str;
        }
      } else {
        map.put(str, 1);
      }
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
