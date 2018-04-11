/*
 *  Warmup-2 --> doubleX
 *
 *    Given a string, return true if the first instance of "x" in the string is immediately followed by
 *    another "x".
 *
 *  Tests:
 *    doubleX("axxbb") ? true
 *    doubleX("axaxax") ? false
 *    doubleX("xxxxx") ? true
 *    doubleX("xaxxx") ? false
 *    doubleX("aaaax") ? false
 *    doubleX("") ? false
 *    doubleX("abc") ? false
 *    doubleX("x") ? false
 *    doubleX("xx") ? true
 *    doubleX("xax") ? false
 *    doubleX("xaxx") ? false
 */
public class DoubleX {
  public boolean doubleX(String str) {
    int firstPos = str.indexOf("x");
    if ((firstPos > -1) && (firstPos < str.length() - 1)) {
      if (str.substring(firstPos + 1, firstPos + 2).equals("x")) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
