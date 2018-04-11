/*
 *  Functional-2 --> noZ
 *
 *    Given a list of strings, return a list of the strings, omitting any string that contains a "z".
 *    (Note: the str.contains(x) method returns a boolean)
 *
 *  Tests:
 *    noZ(["aaa", "bbb", "aza"]) ? ["aaa", "bbb"]
 *    noZ(["hziz", "hzello", "hi"]) ? ["hi"]
 *    noZ(["hello", "howz", "are", "youz"]) ? ["hello", "are"]
 *    noZ([]) ? []
 *    noZ([""]) ? [""]
 *    noZ(["x", "y", "z"]) ? ["x", "y"]
 *    other tests
 */
public class NoZ {
  public List<String> noZ(List<String> strings) {
    strings.removeIf(s -> s.contains("z"));
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
