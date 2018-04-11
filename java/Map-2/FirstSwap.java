/*
 *  Map-2 --> firstSwap
 *
 *    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over
 *    and then return the given array of non-empty strings as follows: if a string matches an earlier
 *    string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap,
 *    so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved
 *    making just one pass over the array. More difficult than it looks.
 *
 *  Tests:
 *    firstSwap(["ab", "ac"]) ? ["ac", "ab"]
 *    firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ? ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
 *    firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ? ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
 *    firstSwap(["ax", "bx", "cx", "ay", "cy", "aaa", "abb"]) ? ["ay", "bx", "cy", "ax", "cx", "aaa", "abb"]
 *    firstSwap(["easy", "does", "it", "every", "ice", "eaten"]) ? ["every", "does", "ice", "easy", "it", "eaten"]
 *    firstSwap(["list", "of", "words", "swims", "over", "lily", "water", "wait"]) ? ["lily", "over", "water", "swims", "of", "list", "words", "wait"]
 *    firstSwap(["4", "8", "15", "16", "23", "42"]) ? ["42", "8", "16", "15", "23", "4"]
 *    firstSwap(["aaa"]) ? ["aaa"]
 *    firstSwap([]) ? []
 *    firstSwap(["a", "b", "c", "xx", "yy", "zz"]) ? ["a", "b", "c", "xx", "yy", "zz"]
 *    other tests
 */
public class FirstSwap {
  public String[] firstSwap(String[] strings) {
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
        if (map.get(c) > -1) {
          result[x] = strings[map.get(c)];
          result[map.get(c)] = str;
          map.put(c, -1);
        } else {
          result[x] = str;
        }
      }
      x++;
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
