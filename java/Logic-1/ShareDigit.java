/*
 *  Logic-1 --> shareDigit
 *
 *    Given two ints, each in the range 10..99, return true if there is a digit that appears in both
 *    numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the %
 *    "mod" n%10 gives the right digit.)
 *
 *  Tests:
 *    shareDigit(12, 23) ? true
 *    shareDigit(12, 43) ? false
 *    shareDigit(12, 44) ? false
 *    shareDigit(23, 12) ? true
 *    shareDigit(23, 39) ? true
 *    shareDigit(23, 19) ? false
 *    shareDigit(30, 90) ? true
 *    shareDigit(30, 91) ? false
 *    shareDigit(55, 55) ? true
 *    shareDigit(55, 44) ? false
 *    other tests
 */
public class ShareDigit {
  public boolean shareDigit(int a, int b) {
    int leftA = a / 10;
    int rightA = a % 10;
    int leftB = b / 10;
    int rightB = b % 10;
    if (leftA == leftB || leftA == rightB) return true;
    if (rightA == leftB || rightA == rightB) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
