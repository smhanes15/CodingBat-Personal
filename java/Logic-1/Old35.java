/*
 *  Logic-1 --> old35
 *
 *    Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod"
 *    operator -- see Introduction to Mod
 *
 *  Tests:
 *    old35(3) ? true
 *    old35(10) ? true
 *    old35(15) ? false
 *    old35(5) ? true
 *    old35(9) ? true
 *    old35(8) ? false
 *    old35(7) ? false
 *    old35(6) ? true
 *    old35(17) ? false
 *    old35(18) ? true
 *    old35(29) ? false
 *    old35(20) ? true
 *    old35(21) ? true
 *    old35(22) ? false
 *    old35(45) ? false
 *    old35(99) ? true
 *    other tests
 */
public class Old35 {
  public boolean old35(int n) {
    return ((n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
