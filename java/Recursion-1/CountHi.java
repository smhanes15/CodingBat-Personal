/*
 *  Recursion-1 --> countHi
 *
 *    Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the
 *    string.
 *
 *  Tests:
 *    countHi("xxhixx") ? 1
 *    countHi("xhixhix") ? 2
 *    countHi("hi") ? 1
 *    countHi("hihih") ? 2
 *    countHi("h") ? 0
 *    countHi("") ? 0
 *    countHi("ihihihihih") ? 4
 *    countHi("ihihihihihi") ? 5
 *    countHi("hiAAhi12hi") ? 3
 *    countHi("xhixhxihihhhih") ? 3
 *    countHi("ship") ? 1
 *    other tests
 */
public class CountHi {
  public int countHi(String str) {
    if (str.length() < 2) return 0;
    return ((str.substring(0, 2).equals("hi")) ? 1 : 0) + countHi(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
