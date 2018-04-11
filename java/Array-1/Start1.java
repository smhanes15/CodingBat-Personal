/*
 *  Array-1 --> start1
 *
 *    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first
 *    element.
 *
 *  Tests:
 *    start1([1, 2, 3], [1, 3]) ? 2
 *    start1([7, 2, 3], [1]) ? 1
 *    start1([1, 2], []) ? 1
 *    start1([], [1, 2]) ? 1
 *    start1([7], []) ? 0
 *    start1([7], [1]) ? 1
 *    start1([1], [1]) ? 2
 *    start1([7], [8]) ? 0
 *    start1([], []) ? 0
 *    start1([1, 3], [1]) ? 2
 *    other tests
 */
public class Start1 {
  public int start1(int[] a, int[] b) {
    int total = 0;
    if (a.length > 0 && a[0] == 1) total++;
    if (b.length > 0 && b[0] == 1) total++;
    return total;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
