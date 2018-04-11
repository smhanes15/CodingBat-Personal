/*
 *  String-1 --> nTwice
 *
 *    Given a string and an int n, return a string made of the first and last n chars from the string. The
 *    string length will be at least n.
 *
 *  Tests:
 *    nTwice("Hello", 2) ? "Helo"
 *    nTwice("Chocolate", 3) ? "Choate"
 *    nTwice("Chocolate", 1) ? "Ce"
 *    nTwice("Chocolate", 0) ? ""
 *    nTwice("Hello", 4) ? "Hellello"
 *    nTwice("Code", 4) ? "CodeCode"
 *    nTwice("Code", 2) ? "Code"
 *    other tests
 */
public class NTwice {
  public String nTwice(String str, int n) {
    return str.substring(0, n) + str.substring(str.length() - n);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
