/*
 *  Warmup-1 --> startOz
 *
 *    Given a string, return a string made of the first 2 chars (if present), however include first char
 *    only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 *
 *  Tests:
 *    startOz("ozymandias") ? "oz"
 *    startOz("bzoo") ? "z"
 *    startOz("oxx") ? "o"
 *    startOz("oz") ? "oz"
 *    startOz("ounce") ? "o"
 *    startOz("o") ? "o"
 *    startOz("abc") ? ""
 *    startOz("") ? ""
 *    startOz("zoo") ? ""
 *    startOz("aztec") ? "z"
 *    startOz("zzzz") ? "z"
 *    startOz("oznic") ? "oz"
 */
public class StartOz {
  public String startOz(String str) {
    String newStr = "";
    if (str.length() > 0) {
      if (str.substring(0, 1).equals("o")) {
        newStr += str.substring(0, 1);
      }
    }
    if (str.length() > 1) {
      if (str.substring(1, 2).equals("z")) {
        newStr += str.substring(1, 2);
      }
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
