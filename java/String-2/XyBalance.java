/*
 *  String-2 --> xyBalance
 *
 *    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
 *    char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance
 *    multiple 'x's. Return true if the given string is xy-balanced.
 *
 *  Tests:
 *    xyBalance("aaxbby") ? true
 *    xyBalance("aaxbb") ? false
 *    xyBalance("yaaxbb") ? false
 *    xyBalance("yaaxbby") ? true
 *    xyBalance("xaxxbby") ? true
 *    xyBalance("xaxxbbyx") ? false
 *    xyBalance("xxbxy") ? true
 *    xyBalance("xxbx") ? false
 *    xyBalance("bbb") ? true
 *    xyBalance("bxbb") ? false
 *    xyBalance("bxyb") ? true
 *    xyBalance("xy") ? true
 *    xyBalance("y") ? true
 *    xyBalance("x") ? false
 *    xyBalance("") ? true
 *    xyBalance("yxyxyxyx") ? false
 *    xyBalance("yxyxyxyxy") ? true
 *    xyBalance("12xabxxydxyxyzz") ? true
 *    other tests
 */
public class XyBalance {
  public boolean xyBalance(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x') {
        if (str.substring(i + 1).indexOf("y") == -1) {
          return false;
        }
      }
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
