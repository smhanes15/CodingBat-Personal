/*
 *  Warmup-1 --> in3050
 *
 *    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in
 *    the range 40..50 inclusive.
 *
 *  Tests:
 *    in3050(30, 31) ? true
 *    in3050(30, 41) ? false
 *    in3050(40, 50) ? true
 *    in3050(40, 51) ? false
 *    in3050(39, 50) ? false
 *    in3050(50, 39) ? false
 *    in3050(40, 39) ? true
 *    in3050(49, 48) ? true
 *    in3050(50, 40) ? true
 *    in3050(50, 51) ? false
 *    in3050(35, 36) ? true
 *    in3050(35, 45) ? false
 */
public class In3050 {
  public boolean in3050(int a, int b) {
    if ((a > 29 && a < 41) && (b > 29 && b < 41)) return true;
    if ((a > 39 && a < 51) && (b > 39 && b < 51)) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
