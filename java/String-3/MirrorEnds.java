/*
 *  String-3 --> mirrorEnds
 *
 *    Given a string, look for a mirror image (backwards) string at both the beginning and end of the
 *    given string. In other words, zero or more characters at the very begining of the given string, and
 *    at the very end of the string in reverse order (possibly overlapping). For example, the string
 *    "abXYZba" has the mirror end "ab".
 *
 *  Tests:
 *    mirrorEnds("abXYZba") ? "ab"
 *    mirrorEnds("abca") ? "a"
 *    mirrorEnds("aba") ? "aba"
 *    mirrorEnds("abab") ? ""
 *    mirrorEnds("xxx") ? "xxx"
 *    mirrorEnds("xxYxx") ? "xxYxx"
 *    mirrorEnds("Hi and iH") ? "Hi "
 *    mirrorEnds("x") ? "x"
 *    mirrorEnds("") ? ""
 *    mirrorEnds("123and then 321") ? "123"
 *    mirrorEnds("band andab") ? "ba"
 *    other tests
 */
public class MirrorEnds {
  public String mirrorEnds(String string) {
    for (int x = 0, r = string.length() - 1; x < string.length(); x++, r--) {
      if (string.charAt(x) != string.charAt(r)) return string.substring(0, x);
    }
    return string;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
