/*
 *  Array-3 --> squareUp
 *
 *    Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1, 0,
 *    2, 1, 3, 2, 1} (spaces added to show the 3 groups).
 *
 *  Tests:
 *    squareUp(3) ? [0, 0, 1, 0, 2, 1, 3, 2, 1]
 *    squareUp(2) ? [0, 1, 2, 1]
 *    squareUp(4) ? [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 *    squareUp(1) ? [1]
 *    squareUp(0) ? []
 *    squareUp(6) ? [0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1]
 */
public class SquareUp {
  public int[] squareUp(int n) {
    int[] nums = new int[n * n];
    if (n == 0) return nums;
    for (int x = n - 1; x < nums.length; x += n) {
      for (int y = x; y >= (x - (x / n)); y--) {
        nums[y] = x - y + 1;
      }
    }
    return nums;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
