/*
 *  Recursion-1 --> countX
 *
 *    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 *
 *  Tests:
 *    countX("xxhixx") ? 4
 *    countX("xhixhix") ? 3
 *    countX("hi") ? 0
 *    countX("h") ? 0
 *    countX("x") ? 1
 *    countX("") ? 0
 *    countX("hihi") ? 0
 *    countX("hiAAhi12hi") ? 0
 *    other tests
 */
public class CountX {
  public int countX(String str) {
    if (str.length() == 0) return 0;
    if (str.length() == 1) {
      return (str.substring(0).equals("x")) ? 1 : 0;
    }
    return ((str.substring(0, 1).equals("x")) ? 1 : 0) + countX(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
