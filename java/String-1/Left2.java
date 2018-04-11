/*
 *  String-1 --> left2
 *
 *    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The
 *    string length will be at least 2.
 *
 *  Tests:
 *    left2("Hello") ? "lloHe"
 *    left2("java") ? "vaja"
 *    left2("Hi") ? "Hi"
 *    left2("code") ? "deco"
 *    left2("cat") ? "tca"
 *    left2("12345") ? "34512"
 *    left2("Chocolate") ? "ocolateCh"
 *    left2("bricks") ? "icksbr"
 *    other tests
 */
public class Left2 {
  public String left2(String str) {
    return str.substring(2) + str.substring(0, 2);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
