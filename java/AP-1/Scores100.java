/*
 *  AP-1 --> scores100
 *
 *    Given an array of scores, return true if there are scores of 100 next to each other in the array.
 *    The array length will be at least 2.
 *
 *  Tests:
 *    scores100([1, 100, 100]) ? true
 *    scores100([1, 100, 99, 100]) ? false
 *    scores100([100, 1, 100, 100]) ? true
 *    scores100([100, 1, 100, 1]) ? false
 *    scores100([1, 2, 3, 4, 5]) ? false
 *    scores100([1, 2, 100, 4, 5]) ? false
 *    other tests
 */
public class Scores100 {
  public boolean scores100(int[] scores) {
    for (int x = 0; x < scores.length - 1; x++) {
      if (scores[x] == 100 && scores[x] == scores[x + 1]) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
