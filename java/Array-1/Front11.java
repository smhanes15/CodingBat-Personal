/*
 *  Array-1 --> front11
 *
 *    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
 *    If either array is length 0, ignore that array.
 *
 *  Tests:
 *    front11([1, 2, 3], [7, 9, 8]) ? [1, 7]
 *    front11([1], [2]) ? [1, 2]
 *    front11([1, 7], []) ? [1]
 *    front11([], [2, 8]) ? [2]
 *    front11([], []) ? []
 *    front11([3], [1, 4, 1, 9]) ? [3, 1]
 *    front11([1, 4, 1, 9], []) ? [1]
 *    other tests
 */
public class Front11 {
  public int[] front11(int[] a, int[] b) {
    int c[] = new int[0];
    if (a.length > 0 && b.length < 1) {
      c = new int[1];
      c[0] = a[0];
    }
    if (a.length < 1 && b.length > 0) {
      c = new int[1];
      c[0] = b[0];
    }
    if (a.length > 0 && b.length > 0) {
      c = new int[2];
      c[0] = a[0];
      c[1] = b[0];
    }
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
