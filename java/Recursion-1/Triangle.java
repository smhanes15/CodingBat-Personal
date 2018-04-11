/*
 *  Recursion-1 --> triangle
 *
 *    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the
 *    next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number
 *    of blocks in such a triangle with the given number of rows.
 *
 *  Tests:
 *    triangle(0) ? 0
 *    triangle(1) ? 1
 *    triangle(2) ? 3
 *    triangle(3) ? 6
 *    triangle(4) ? 10
 *    triangle(5) ? 15
 *    triangle(6) ? 21
 *    triangle(7) ? 28
 *    other tests
 */
public class Triangle {
  public int triangle(int rows) {
    int n = rows;
    if (n == 0) return 0;
    if (n == 1) return 1;
    return n + triangle(n - 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
