/*
 *  Functional-2 --> noLong
 *
 *    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
 *
 *  Tests:
 *    noLong(["this", "not", "too", "long"]) ? ["not", "too"]
 *    noLong(["a", "bbb", "cccc"]) ? ["a", "bbb"]
 *    noLong(["cccc", "cccc", "cccc"]) ? []
 *    noLong([]) ? []
 *    noLong([""]) ? [""]
 *    noLong(["empty", "", "empty"]) ? [""]
 *    noLong(["a"]) ? ["a"]
 *    noLong(["aaaa", "bbb", "***", "333"]) ? ["bbb", "***", "333"]
 *    other tests
 */
public class NoLong {
  public List<String> noLong(List<String> strings) {
    strings.removeIf(s -> s.length() > 3);
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
