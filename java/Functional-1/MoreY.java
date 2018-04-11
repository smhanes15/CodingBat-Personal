/*
 *  Functional-1 --> moreY
 *
 *    Given a list of strings, return a list where each string has "y" added at its start and end.
 *
 *  Tests:
 *    moreY(["a", "b", "c"]) ? ["yay", "yby", "ycy"]
 *    moreY(["hello", "there"]) ? ["yhelloy", "ytherey"]
 *    moreY(["yay"]) ? ["yyayy"]
 *    moreY(["", "a", "xx"]) ? ["yy", "yay", "yxxy"]
 *    moreY([]) ? []
 *    moreY(["xx", "yy", "zz"]) ? ["yxxy", "yyyy", "yzzy"]
 *    other tests
 */
public class MoreY {
  public List<String> moreY(List<String> strings) {
    strings.replaceAll(s -> "y" + s + "y");
    return strings;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
