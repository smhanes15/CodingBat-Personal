/*
 *  Warmup-1 --> loneTeen
 *
 *    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return
 *    true if one or the other is teen, but not both.
 *
 *  Tests:
 *    loneTeen(13, 99) ? true
 *    loneTeen(21, 19) ? true
 *    loneTeen(13, 13) ? false
 *    loneTeen(14, 20) ? true
 *    loneTeen(20, 15) ? true
 *    loneTeen(16, 17) ? false
 *    loneTeen(16, 9) ? true
 *    loneTeen(16, 18) ? false
 *    loneTeen(13, 19) ? false
 *    loneTeen(13, 20) ? true
 *    loneTeen(6, 18) ? true
 *    loneTeen(99, 13) ? true
 *    loneTeen(99, 99) ? false
 */
public class LoneTeen {
  public boolean loneTeen(int a, int b) {
    int l = 12;
    int h = 20;
    boolean teenA = false;
    boolean teenB = false;
    if (a > l && a < h) teenA = true;
    if (b > l && b < h) teenB = true;
    if (teenA && teenB) return false;
    if (teenA || teenB) return true;
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
