/*
 *  String-2 --> getSandwich
 *
 *    A sandwich is two pieces of bread with something in between. Return the string that is between the
 *    first and last appearance of "bread" in the given string, or return the empty string "" if there are
 *    not two pieces of bread.
 *
 *  Tests:
 *    getSandwich("breadjambread") ? "jam"
 *    getSandwich("xxbreadjambreadyy") ? "jam"
 *    getSandwich("xxbreadyy") ? ""
 *    getSandwich("xxbreadbreadjambreadyy") ? "breadjam"
 *    getSandwich("breadAbread") ? "A"
 *    getSandwich("breadbread") ? ""
 *    getSandwich("abcbreaz") ? ""
 *    getSandwich("xyz") ? ""
 *    getSandwich("") ? ""
 *    getSandwich("breadbreaxbread") ? "breax"
 *    getSandwich("breaxbreadybread") ? "y"
 *    getSandwich("breadbreadbreadbread") ? "breadbread"
 *    other tests
 */
public class GetSandwich {
  public String getSandwich(String str) {
    int first = str.indexOf("bread");
    int last = str.lastIndexOf("bread");
    if (first == last) return "";
    return str.substring(first + 5, last);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
