/*
 *  Functional-2 --> noYY
 *
 *    Given a list of strings, return a list where each string has "y" added at its end, omitting any
 *    resulting strings that contain "yy" as a substring anywhere.
 *
 *  Tests:
 *    noYY(["a", "b", "c"]) ? ["ay", "by", "cy"]
 *    noYY(["a", "b", "cy"]) ? ["ay", "by"]
 *    noYY(["xx", "ya", "zz"]) ? ["xxy", "yay", "zzy"]
 *    noYY(["xx", "yay", "zz"]) ? ["xxy", "zzy"]
 *    noYY(["yyx", "y", "zzz"]) ? ["zzzy"]
 *    noYY(["hello", "there"]) ? ["helloy", "therey"]
 *    noYY(["ya"]) ? ["yay"]
 *    noYY([]) ? []
 *    noYY([""]) ? ["y"]
 *    noYY(["xx", "yy", "zz"]) ? ["xxy", "zzy"]
 *    other tests
 */
public class NoYY {
  public List<String> noYY(List<String> strings) {
    strings.replaceAll(s -> s + "y");
    strings.removeIf(s -> s.contains("yy"));
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
