/*
 *  Map-2 --> allSwap
 *
 *    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over
 *    and then return the given array of non-empty strings as follows: if a string matches an earlier
 *    string in the array, swap the 2 strings in the array. When a position in the array has been swapped,
 *    it no longer matches anything. Using a map, this can be solved making just one pass over the array.
 *    More difficult than it looks.
 *
 *  Tests:
 *    allSwap(["ab", "ac"]) ? ["ac", "ab"]
 *    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ? ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
 *    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ? ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 *    allSwap(["ax", "bx", "cx", "ay", "cy", "aaa", "abb"]) ? ["ay", "bx", "cy", "ax", "cx", "abb", "aaa"]
 *    allSwap(["easy", "does", "it", "every", "ice", "eaten"]) ? ["every", "does", "ice", "easy", "it", "eaten"]
 *    allSwap(["list", "of", "words", "swims", "over", "lily", "water", "wait"]) ? ["lily", "over", "water", "swims", "of", "list", "words", "wait"]
 *    allSwap(["4", "8", "15", "16", "23", "42"]) ? ["42", "8", "16", "15", "23", "4"]
 *    allSwap(["aaa"]) ? ["aaa"]
 *    allSwap([]) ? []
 *    allSwap(["a", "b", "c", "xx", "yy", "zz"]) ? ["a", "b", "c", "xx", "yy", "zz"]
 *    other tests
 */
public class AllSwap {
  public String[] allSwap(String[] strings) {
    if (strings.length < 2) return strings;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    String[] result = new String[strings.length];
    int x = 0;
    for (String str : strings) {
      char c = str.charAt(0);
      if (!map.containsKey(c)) {
        map.put(c, x);
        result[x] = str;
      } else {
        result[x] = strings[map.get(c)];
        result[map.get(c)] = str;
        map.remove(c);
      }
      x++;
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
