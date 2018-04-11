/*
 *  AP-1 --> matchUp
 *
 *    Given 2 arrays that are the same length containing strings, compare the 1st string in one array to
 *    the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the
 *    2 strings are non-empty and start with the same char. The strings may be any length, including 0.
 *
 *  Tests:
 *    matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) ? 1
 *    matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) ? 2
 *    matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) ? 1
 *    matchUp(["", "", "ccc"], ["aa", "bb", "cc"]) ? 1
 *    matchUp(["", "", ""], ["", "bb", "cc"]) ? 0
 *    matchUp(["aa", "bb", "cc"], ["", "", ""]) ? 0
 *    matchUp(["aa", "", "ccc"], ["", "bb", "cc"]) ? 1
 *    matchUp(["x", "y", "z"], ["y", "z", "x"]) ? 0
 *    matchUp(["", "y", "z"], ["", "y", "x"]) ? 1
 *    matchUp(["x", "y", "z"], ["xx", "yyy", "zzz"]) ? 3
 *    matchUp(["x", "y", "z"], ["xx", "yyy", ""]) ? 2
 *    matchUp(["b", "x", "y", "z"], ["a", "xx", "yyy", "zzz"]) ? 3
 *    matchUp(["aaa", "bb", "c"], ["aaa", "xx", "bb"]) ? 1
 *    other tests
 */
public class MatchUp {
  public int matchUp(String[] a, String[] b) {
    int count = 0;
    for (int x = 0; x < a.length; x++) {
      if (a[x].length() > 0 && b[x].length() > 0) {
        if (a[x].charAt(0) == b[x].charAt(0)) {
          count++;
        }
      }
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
