/*
 *  Recursion-1 --> countPairs
 *
 *    We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's
 *    make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively
 *    compute the number of pairs in the given string.
 *
 *  Tests:
 *    countPairs("axa") ? 1
 *    countPairs("axax") ? 2
 *    countPairs("axbx") ? 1
 *    countPairs("hi") ? 0
 *    countPairs("hihih") ? 3
 *    countPairs("ihihhh") ? 3
 *    countPairs("ihjxhh") ? 0
 *    countPairs("") ? 0
 *    countPairs("a") ? 0
 *    countPairs("aa") ? 0
 *    countPairs("aaa") ? 1
 *    other tests
 */
public class CountPairs {
  public int countPairs(String str) {
    if (str.length() <= 2) {
      return 0;
    }
    if (str.substring(0, 1).equals(str.substring(2, 3))) {
      return 1 + countPairs(str.substring(1));
    }
    return 0 + countPairs(str.substring(1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
