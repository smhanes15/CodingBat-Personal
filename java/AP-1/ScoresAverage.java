/*
 *  AP-1 --> scoresAverage
 *
 *    Given an array of scores, compute the int average of the first half and the second half, and return
 *    whichever is larger. We'll say that the second half begins at index length/2. The array length will
 *    be at least 2. To practice decomposition, write a separate helper method int average(int[] scores,
 *    int start, int end) { which computes the average of the elements between indexes start..end. Call
 *    your helper method twice to implement scoresAverage(). Write your helper method after your
 *    scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles,
 *    but here we use ints so the expected results are exact.
 *
 *  Tests:
 *    scoresAverage([2, 2, 4, 4]) ? 4
 *    scoresAverage([4, 4, 4, 2, 2, 2]) ? 4
 *    scoresAverage([3, 4, 5, 1, 2, 3]) ? 4
 *    scoresAverage([5, 6]) ? 6
 *    scoresAverage([5, 4]) ? 5
 *    scoresAverage([5, 4, 5, 6, 2, 1, 2, 3]) ? 5
 *    other tests
 */
public class ScoresAverage {
  public int scoresAverage(int[] scores) {
    int l = scores.length;
    return Math.max(average(scores, 0, l / 2), average(scores, l / 2, l));
  }

  public int average(int[] scores, int start, int end) {
    int sum = 0;
    for (int x = start; x < end; x++) {
      sum += scores[x];
    }
    return sum / (scores.length / 2);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
