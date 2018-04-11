/*
 *  Recursion-1 --> countHi2
 *
 *    Given a string, compute recursively the number of times lowercase "hi" appears in the string,
 *    however do not count "hi" that have an 'x' immedately before them.
 *
 *  Tests:
 *    countHi2("ahixhi") ? 1
 *    countHi2("ahibhi") ? 2
 *    countHi2("xhixhi") ? 0
 *    countHi2("hixhi") ? 1
 *    countHi2("hixhhi") ? 2
 *    countHi2("hihihi") ? 3
 *    countHi2("hihihix") ? 3
 *    countHi2("xhihihix") ? 2
 *    countHi2("xxhi") ? 0
 *    countHi2("hixxhi") ? 1
 *    countHi2("hi") ? 1
 *    countHi2("xxxx") ? 0
 *    countHi2("h") ? 0
 *    countHi2("x") ? 0
 *    countHi2("") ? 0
 *    countHi2("Hellohi") ? 1
 *    other tests
 */
public class CountHi2 {
  public int countHi2(String str) {
    if (str.length() < 2) return 0;
    int x = str.indexOf("x");
    int hi = str.indexOf("hi");
    if (x < 0 || x > hi) {
      if (hi == 0) return 1 + countHi2(str.substring(2));
    }
    if (x == 0) {
      if (hi == 1) return 0 + countHi2(str.substring(2));
    }
    return 0 + countHi2(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
