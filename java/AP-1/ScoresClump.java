/*
 *  AP-1 --> scoresClump
 *
 *    Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent
 *    scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
 *
 *  Tests:
 *    scoresClump([3, 4, 5]) ? true
 *    scoresClump([3, 4, 6]) ? false
 *    scoresClump([1, 3, 5, 5]) ? true
 *    scoresClump([2, 4, 5, 6]) ? true
 *    scoresClump([2, 4, 5, 7]) ? false
 *    scoresClump([2, 4, 4, 7]) ? true
 *    scoresClump([3, 3, 6, 7, 9]) ? false
 *    scoresClump([3, 3, 7, 7, 9]) ? true
 *    scoresClump([4, 5, 8]) ? false
 *    other tests
 */
public class ScoresClump {
  public boolean scoresClump(int[] scores) {
    int diff = 0;
    for (int x = 0; x < scores.length - 2; x++) {
      diff = scores[x + 2] - scores[x];
      if (diff < 3) return true;
    }
    return false;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
