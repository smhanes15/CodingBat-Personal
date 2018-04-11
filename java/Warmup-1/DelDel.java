/*
 *  Warmup-1 --> delDel
 *
 *    Given a string, if the string "del" appears starting at index 1, return a string where that "del"
 *    has been deleted. Otherwise, return the string unchanged.
 *
 *  Tests:
 *    delDel("adelbc") ? "abc"
 *    delDel("adelHello") ? "aHello"
 *    delDel("adedbc") ? "adedbc"
 *    delDel("abcdel") ? "abcdel"
 *    delDel("add") ? "add"
 *    delDel("ad") ? "ad"
 *    delDel("a") ? "a"
 *    delDel("") ? ""
 *    delDel("del") ? "del"
 *    delDel("adel") ? "a"
 *    delDel("aadelbb") ? "aadelbb"
 */
public class DelDel {
  public String delDel(String str) {
    String newStr = str;
    if (str.length() < 4) {
      return newStr;
    }
    if (str.substring(1, 4).equals("del")) {
      newStr = str.substring(0, 1) + str.substring(4);
    }
    return newStr;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
