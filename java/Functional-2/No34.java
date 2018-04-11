/*
 *  Functional-2 --> no34
 *
 *    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
 *
 *  Tests:
 *    no34(["a", "bb", "ccc"]) ? ["a", "bb"]
 *    no34(["a", "bb", "ccc", "dddd"]) ? ["a", "bb"]
 *    no34(["ccc", "dddd", "apple"]) ? ["apple"]
 *    no34(["this", "not", "too", "long"]) ? []
 *    no34(["a", "bbb", "cccc", "xx"]) ? ["a", "xx"]
 *    no34(["dddd", "ddd", "xxxxxxx"]) ? ["xxxxxxx"]
 *    no34([]) ? []
 *    no34([""]) ? [""]
 *    no34(["empty", "", "empty"]) ? ["empty", "", "empty"]
 *    no34(["a"]) ? ["a"]
 *    no34(["aaaa", "bbb", "*****", "333"]) ? ["*****"]
 *    other tests
 */
public class No34 {
  public List<String> no34(List<String> strings) {
    strings.removeIf(s -> s.length() == 3 || s.length() == 4);
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
