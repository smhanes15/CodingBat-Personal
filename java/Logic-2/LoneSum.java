/*
 *  Logic-2 --> loneSum
 *
 *    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of
 *    the values, it does not count towards the sum.
 *
 *  Tests:
 *    loneSum(1, 2, 3) ? 6
 *    loneSum(3, 2, 3) ? 2
 *    loneSum(3, 3, 3) ? 0
 *    loneSum(9, 2, 2) ? 9
 *    loneSum(2, 2, 9) ? 9
 *    loneSum(2, 9, 2) ? 9
 *    loneSum(2, 9, 3) ? 14
 *    loneSum(4, 2, 3) ? 9
 *    loneSum(1, 3, 1) ? 3
 *    other tests
 */
public class LoneSum {
  public int loneSum(int a, int b, int c) {
    int x, y, z;
    x = ((a == b) || (a == c)) ? 0 : a;
    y = ((b == a) || (b == c)) ? 0 : b;
    z = ((c == a) || (c == b)) ? 0 : c;
    return x + y + z;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
