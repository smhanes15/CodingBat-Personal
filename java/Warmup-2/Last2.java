/*
 *  Warmup-2 --> last2
 *
 *    Given a string, return the count of the number of times that a substring length 2 appears in the
 *    string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end
 *    substring).
 *
 *  Tests:
 *    last2("hixxhi") ? 1
 *    last2("xaxxaxaxx") ? 1
 *    last2("axxxaaxx") ? 2
 *    last2("xxaxxaxxaxx") ? 3
 *    last2("xaxaxaxx") ? 0
 *    last2("xxxx") ? 2
 *    last2("13121312") ? 1
 *    last2("11212") ? 1
 *    last2("13121311") ? 0
 *    last2("1717171") ? 2
 *    last2("hi") ? 0
 *    last2("h") ? 0
 *    last2("") ? 0
 */
public class Last2 {
  public int last2(String str) {
    int count = 0;
    if (str.length() < 3) return count;
    String needle = str.substring(str.length() - 2);
    String haystack = str.substring(0, str.length() - 1);
    for (int x = 0; x < haystack.length() - 1; x++) {
      if (haystack.substring(x, x + 2).equals(needle)) count++;
    }
    return count;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
