/*
 *  String-2 --> oneTwo
 *
 *    Given a string, compute a new string by moving the first char to come after the next two chars, so
 *    "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields
 *    "bcaefd". Ignore any group of fewer than 3 chars at the end.
 *
 *  Tests:
 *    oneTwo("abc") ? "bca"
 *    oneTwo("tca") ? "cat"
 *    oneTwo("tcagdo") ? "catdog"
 *    oneTwo("chocolate") ? "hocolctea"
 *    oneTwo("1234567890") ? "231564897"
 *    oneTwo("xabxabxabxabxabxabxab") ? "abxabxabxabxabxabxabx"
 *    oneTwo("abcdefx") ? "bcaefd"
 *    oneTwo("abcdefxy") ? "bcaefd"
 *    oneTwo("abcdefxyz") ? "bcaefdyzx"
 *    oneTwo("") ? ""
 *    oneTwo("x") ? ""
 *    oneTwo("xy") ? ""
 *    oneTwo("xyz") ? "yzx"
 *    oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890") ? "bcaefdhigkljmnkpqostrvwuyzx231564897"
 *    oneTwo("abcdefghijklkmnopqrstuvwxyz123456789") ? "bcaefdhigkljmnkpqostrvwuyzx231564897"
 *    oneTwo("abcdefghijklkmnopqrstuvwxyz12345678") ? "bcaefdhigkljmnkpqostrvwuyzx231564"
 *    other tests
 */
public class OneTwo {
  public String oneTwo(String str) {
    String result = "";
    for (int x = 0; x < str.length() - 2; x += 3) {
      result += str.substring(x + 1, x + 3);
      result += str.substring(x, x + 1);
    }
    return result;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
