/*
 *  String-2 --> xyzThere
 *
 *    Return true if the given string contains an appearance of "xyz" where the xyz is not directly
 *    preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 *
 *  Tests:
 *    xyzThere("abcxyz") ? true
 *    xyzThere("abc.xyz") ? false
 *    xyzThere("xyz.abc") ? true
 *    xyzThere("abcxy") ? false
 *    xyzThere("xyz") ? true
 *    xyzThere("xy") ? false
 *    xyzThere("x") ? false
 *    xyzThere("") ? false
 *    xyzThere("abc.xyzxyz") ? true
 *    xyzThere("abc.xxyz") ? true
 *    xyzThere(".xyz") ? false
 *    xyzThere("12.xyz") ? false
 *    xyzThere("12xyz") ? true
 *    xyzThere("1.xyz.xyz2.xyz") ? false
 *    other tests
 */
public class XyzThere {
  public boolean xyzThere(String str) {
    for (int x = 0; x < str.length() - 2; x++) {
      if (str.substring(x, x + 3).equals("xyz")) {
        if (x == 0 || !str.substring(x - 1, x).equals(".")) {
          return true;
        }
      }
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
