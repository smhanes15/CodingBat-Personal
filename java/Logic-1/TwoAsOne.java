/*
 *  Logic-1 --> twoAsOne
 *
 *    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 *
 *  Tests:
 *    twoAsOne(1, 2, 3) ? true
 *    twoAsOne(3, 1, 2) ? true
 *    twoAsOne(3, 2, 2) ? false
 *    twoAsOne(2, 3, 1) ? true
 *    twoAsOne(5, 3, -2) ? true
 *    twoAsOne(5, 3, -3) ? false
 *    twoAsOne(2, 5, 3) ? true
 *    twoAsOne(9, 5, 5) ? false
 *    twoAsOne(9, 4, 5) ? true
 *    twoAsOne(5, 4, 9) ? true
 *    twoAsOne(3, 3, 0) ? true
 *    twoAsOne(3, 3, 2) ? false
 *    other tests
 */
public class TwoAsOne {
  public boolean twoAsOne(int a, int b, int c) {
    if (a + b == c) return true;
    if (a + c == b) return true;
    if (b + c == a) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
