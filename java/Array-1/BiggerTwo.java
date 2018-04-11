/*
 *  Array-1 --> biggerTwo
 *
 *    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
 *    Return the array which has the largest sum. In event of a tie, return a.
 *
 *  Tests:
 *    biggerTwo([1, 2], [3, 4]) ? [3, 4]
 *    biggerTwo([3, 4], [1, 2]) ? [3, 4]
 *    biggerTwo([1, 1], [1, 2]) ? [1, 2]
 *    biggerTwo([2, 1], [1, 1]) ? [2, 1]
 *    biggerTwo([2, 2], [1, 3]) ? [2, 2]
 *    biggerTwo([1, 3], [2, 2]) ? [1, 3]
 *    biggerTwo([6, 7], [3, 1]) ? [6, 7]
 *    other tests
 */
public class BiggerTwo {
  public int[] biggerTwo(int[] a, int[] b) {
    int sumA = a[0] + a[1];
    int sumB = b[0] + b[1];
    if (sumA >= sumB) return a;
    return b;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
