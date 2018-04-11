/*
 *  AP-1 --> scoresIncreasing
 *
 *    Given an array of scores, return true if each score is equal or greater than the one before. The
 *    array will be length 2 or more.
 *
 *  Tests:
 *    scoresIncreasing([1, 3, 4]) ? true
 *    scoresIncreasing([1, 3, 2]) ? false
 *    scoresIncreasing([1, 1, 4]) ? true
 *    scoresIncreasing([1, 1, 2, 4, 4, 7]) ? true
 *    scoresIncreasing([1, 1, 2, 4, 3, 7]) ? false
 *    scoresIncreasing([-5, 4, 11]) ? true
 */
public class ScoresIncreasing {
  public boolean scoresIncreasing(int[] scores) {
    for (int x = 0; x < scores.length - 1; x++) {
      if (scores[x] > scores[x + 1]) return false;
    }
    return true;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
