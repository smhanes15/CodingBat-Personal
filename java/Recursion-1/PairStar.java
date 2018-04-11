/*
 *  Recursion-1 --> pairStar
 *
 *    Given a string, compute recursively a new string where identical chars that are adjacent in the
 *    original string are separated from each other by a "*".
 *
 *  Tests:
 *    pairStar("hello") ? "hel*lo"
 *    pairStar("xxyy") ? "x*xy*y"
 *    pairStar("aaaa") ? "a*a*a*a"
 *    pairStar("aaab") ? "a*a*ab"
 *    pairStar("aa") ? "a*a"
 *    pairStar("a") ? "a"
 *    pairStar("") ? ""
 *    pairStar("noadjacent") ? "noadjacent"
 *    pairStar("abba") ? "ab*ba"
 *    pairStar("abbba") ? "ab*b*ba"
 *    other tests
 */
public class PairStar {
  public String pairStar(String str) {
    if (str.length() < 2) {
      return str;
    }
    if (str.substring(0, 1).equals(str.substring(1, 2))) {
      return str.substring(0, 1) + "*" + pairStar(str.substring(1));
    }
    return str.substring(0, 1) + pairStar(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
