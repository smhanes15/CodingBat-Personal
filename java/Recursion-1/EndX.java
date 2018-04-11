/*
 *  Recursion-1 --> endX
 *
 *    Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved
 *    to the end of the string.
 *
 *  Tests:
 *    endX("xxre") ? "rexx"
 *    endX("xxhixx") ? "hixxxx"
 *    endX("xhixhix") ? "hihixxx"
 *    endX("hiy") ? "hiy"
 *    endX("h") ? "h"
 *    endX("x") ? "x"
 *    endX("xx") ? "xx"
 *    endX("") ? ""
 *    endX("bxx") ? "bxx"
 *    endX("bxax") ? "baxx"
 *    endX("axaxax") ? "aaaxxx"
 *    endX("xxhxi") ? "hixxx"
 *    other tests
 */
public class EndX {
  public String endX(String str) {
    if (str.length() <= 1) {
      return str;
    }
    if (str.substring(0, 1).equals("x")) {
      return endX(str.substring(1)) + "x";
    }
    return str.substring(0, 1) + endX(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
