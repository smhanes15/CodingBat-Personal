/*
 *  Recursion-1 --> allStar
 *
 *    Given a string, compute recursively a new string where all the adjacent chars are now separated by a
 *    "*".
 *
 *  Tests:
 *    allStar("hello") ? "h*e*l*l*o"
 *    allStar("abc") ? "a*b*c"
 *    allStar("ab") ? "a*b"
 *    allStar("a") ? "a"
 *    allStar("") ? ""
 *    allStar("3.14") ? "3*.*1*4"
 *    allStar("Chocolate") ? "C*h*o*c*o*l*a*t*e"
 *    allStar("1234") ? "1*2*3*4"
 *    other tests
 */
public class AllStar {
  public String allStar(String str) {
    if (str.length() <= 1) {
      return str;
    }
    return str.substring(0, 1) + "*" + allStar(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
