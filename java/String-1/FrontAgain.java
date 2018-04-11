/*
 *  String-1 --> frontAgain
 *
 *    Given a string, return true if the first 2 chars in the string also appear at the end of the string,
 *    such as with "edited".
 *
 *  Tests:
 *    frontAgain("edited") ? true
 *    frontAgain("edit") ? false
 *    frontAgain("ed") ? true
 *    frontAgain("jj") ? true
 *    frontAgain("jjj") ? true
 *    frontAgain("jjjj") ? true
 *    frontAgain("jjjk") ? false
 *    frontAgain("x") ? false
 *    frontAgain("") ? false
 *    frontAgain("java") ? false
 *    frontAgain("javaja") ? true
 *    other tests
 */
public class FrontAgain {
  public boolean frontAgain(String str) {
    int l = str.length();
    if (l < 2) return false;
    if (str.lastIndexOf(str.substring(0, 2)) == l - 2) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
