/*
 *  String-2 --> doubleChar
 *
 *    Given a string, return a string where for every char in the original, there are two chars.
 *
 *  Tests:
 *    doubleChar("The") ? "TThhee"
 *    doubleChar("AAbb") ? "AAAAbbbb"
 *    doubleChar("Hi-There") ? "HHii--TThheerree"
 *    doubleChar("Word!") ? "WWoorrdd!!"
 *    doubleChar("!!") ? "!!!!"
 *    doubleChar("") ? ""
 *    doubleChar("a") ? "aa"
 *    doubleChar(".") ? ".."
 *    doubleChar("aa") ? "aaaa"
 *    other tests
 */
public class DoubleChar {
  public String doubleChar(String str) {
    String newStr = "";
    for (int count = 0; count < str.length(); count++) {
      newStr += str.substring(count, count + 1);
      newStr += str.substring(count, count + 1);
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
