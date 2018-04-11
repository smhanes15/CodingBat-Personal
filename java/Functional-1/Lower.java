/*
 *  Functional-1 --> lower
 *
 *    Given a list of strings, return a list where each string is converted to lower case (Note: String
 *    toLowerCase() method).
 *
 *  Tests:
 *    lower(["Hello", "Hi"]) ? ["hello", "hi"]
 *    lower(["AAA", "BBB", "ccc"]) ? ["aaa", "bbb", "ccc"]
 *    lower(["KitteN", "ChocolaTE"]) ? ["kitten", "chocolate"]
 *    lower([]) ? []
 *    lower(["EMPTY", ""]) ? ["empty", ""]
 *    lower(["aaX", "bYb", "Ycc", "ZZZ"]) ? ["aax", "byb", "ycc", "zzz"]
 *    other tests
 */
public class Lower {
  public List<String> lower(List<String> strings) {
    strings.replaceAll(s -> s.toLowerCase());
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
