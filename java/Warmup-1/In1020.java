/*
 *  Warmup-1 --> in1020
 *
 *    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 *
 *  Tests:
 *    in1020(12, 99) ? true
 *    in1020(21, 12) ? true
 *    in1020(8, 99) ? false
 *    in1020(99, 10) ? true
 *    in1020(20, 20) ? true
 *    in1020(21, 21) ? false
 *    in1020(9, 9) ? false
 */
public class In1020 {
  public boolean in1020(int a, int b) {
    if ((a > 9 && a < 21) || (b > 9 && b < 21)) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
