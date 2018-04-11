/*
 *  Logic-1 --> sortaSum
 *
 *    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
 *    so in that case just return 20.
 *
 *  Tests:
 *    sortaSum(3, 4) ? 7
 *    sortaSum(9, 4) ? 20
 *    sortaSum(10, 11) ? 21
 *    sortaSum(12, -3) ? 9
 *    sortaSum(-3, 12) ? 9
 *    sortaSum(4, 5) ? 9
 *    sortaSum(4, 6) ? 20
 *    sortaSum(14, 7) ? 21
 *    sortaSum(14, 6) ? 20
 *    other tests
 */
public class SortaSum {
  public int sortaSum(int a, int b) {
    int c = a + b;
    if (c > 9 && c < 20) return 20;
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
