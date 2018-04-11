/*
 *  String-2 --> xyzMiddle
 *
 *    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the
 *    number of chars to the left and right of the "xyz" must differ by at most one. This problem is
 *    harder than it looks.
 *
 *  Tests:
 *    xyzMiddle("AAxyzBB") ? true
 *    xyzMiddle("AxyzBB") ? true
 *    xyzMiddle("AxyzBBB") ? false
 *    xyzMiddle("AxyzBBBB") ? false
 *    xyzMiddle("AAAxyzB") ? false
 *    xyzMiddle("AAAxyzBB") ? true
 *    xyzMiddle("AAAAxyzBB") ? false
 *    xyzMiddle("AAAAAxyzBBB") ? false
 *    xyzMiddle("1x345xyz12x4") ? true
 *    xyzMiddle("xyzAxyzBBB") ? true
 *    xyzMiddle("xyzAxyzBxyz") ? true
 *    xyzMiddle("xyzxyzAxyzBxyzxyz") ? true
 *    xyzMiddle("xyzxyzxyzBxyzxyz") ? true
 *    xyzMiddle("xyzxyzAxyzxyzxyz") ? true
 *    xyzMiddle("xyzxyzAxyzxyzxy") ? false
 *    xyzMiddle("AxyzxyzBB") ? false
 *    xyzMiddle("") ? false
 *    xyzMiddle("x") ? false
 *    xyzMiddle("xy") ? false
 *    xyzMiddle("xyz") ? true
 *    xyzMiddle("xyzz") ? true
 *    other tests
 */
public class XyzMiddle {
  public boolean xyzMiddle(String str) {
    if (!str.contains("xyz") || str.length() < 3) return false;
    int f = str.length() / 2 - 2;
    int s = str.length() / 2 - 1;
    if (str.length() % 2 == 0) {
      return str.substring(f, f + 3).equals("xyz") || str.substring(s, s + 3).equals("xyz");
    }
    return str.substring(s, s + 3).equals("xyz");
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
