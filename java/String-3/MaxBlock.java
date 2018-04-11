/*
 *  String-3 --> maxBlock
 *
 *    Given a string, return the length of the largest "block" in the string. A block is a run of adjacent
 *    chars that are the same.
 *
 *  Tests:
 *    maxBlock("hoopla") ? 2
 *    maxBlock("abbCCCddBBBxx") ? 3
 *    maxBlock("") ? 0
 *    maxBlock("xyz") ? 1
 *    maxBlock("xxyz") ? 2
 *    maxBlock("xyzz") ? 2
 *    maxBlock("abbbcbbbxbbbx") ? 3
 *    maxBlock("XXBBBbbxx") ? 3
 *    maxBlock("XXBBBBbbxx") ? 4
 *    maxBlock("XXBBBbbxxXXXX") ? 4
 *    maxBlock("XX2222BBBbbXX2222") ? 4
 *    other tests
 */
public class MaxBlock {
  public int maxBlock(String str) {
    int max = 0;
    for (int x = 0; x < str.length(); x++) {
      int count = 0;
      for (int y = x; y < str.length(); y++) {
        if (str.charAt(x) == str.charAt(y)) {
          count++;
        } else {
          y = str.length();
        }
      }
      if (count > max) max = count;
    }
    return max;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
