/*
 *  Warmup-1 --> close10
 *
 *    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a
 *    tie. Note that Math.abs(n) returns the absolute value of a number.
 *
 *  Tests:
 *    close10(8, 13) ? 8
 *    close10(13, 8) ? 8
 *    close10(13, 7) ? 0
 *    close10(7, 13) ? 0
 *    close10(9, 13) ? 9
 *    close10(13, 8) ? 8
 *    close10(10, 12) ? 10
 *    close10(11, 10) ? 10
 *    close10(5, 21) ? 5
 *    close10(0, 20) ? 0
 *    close10(10, 10) ? 0
 */
public class Close10 {
  public int close10(int a, int b) {
    int x = Math.abs(a - 10);
    int y = Math.abs(b - 10);
    if (x == y) return 0;
    return (x < y) ? a : b;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
