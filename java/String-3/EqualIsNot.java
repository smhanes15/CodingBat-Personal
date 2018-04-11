/*
 *  String-3 --> equalIsNot
 *
 *    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to
 *    the number of appearances of "not" anywhere in the string (case sensitive).
 *
 *  Tests:
 *    equalIsNot("This is not") ? false
 *    equalIsNot("This is notnot") ? true
 *    equalIsNot("noisxxnotyynotxisi") ? true
 *    equalIsNot("noisxxnotyynotxsi") ? false
 *    equalIsNot("xxxyyyzzzintint") ? true
 *    equalIsNot("") ? true
 *    equalIsNot("isisnotnot") ? true
 *    equalIsNot("isisnotno7Not") ? false
 *    equalIsNot("isnotis") ? false
 *    equalIsNot("mis3notpotbotis") ? false
 *    other tests
 */
public class EqualIsNot {
  public boolean equalIsNot(String str) {
    int not = 0;
    int is = 0;
    for (int x = 0; x < str.length() - 1; x++) {
      if (str.substring(x, x + 2).equals("is")) is++;
    }
    for (int x = 0; x < str.length() - 2; x++) {
      if (str.substring(x, x + 3).equals("not")) not++;
    }
    return is == not;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
