/*
 *  Functional-1 --> noX
 *
 *    Given a list of strings, return a list where each string has all its "x" removed.
 *
 *  Tests:
 *    noX(["ax", "bb", "cx"]) ? ["a", "bb", "c"]
 *    noX(["xxax", "xbxbx", "xxcx"]) ? ["a", "bb", "c"]
 *    noX(["x"]) ? [""]
 *    noX([""]) ? [""]
 *    noX([]) ? []
 *    noX(["the", "taxi"]) ? ["the", "tai"]
 *    noX(["the", "xxtxaxixxx"]) ? ["the", "tai"]
 *    noX(["this", "is", "the", "x"]) ? ["this", "is", "the", ""]
 *    other tests
 */
public class NoX {
  public List<String> noX(List<String> strings) {
    strings.replaceAll(s -> s.replaceAll("x", ""));
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
