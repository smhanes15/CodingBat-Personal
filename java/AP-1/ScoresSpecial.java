/*
 *  AP-1 --> scoresSpecial
 *
 *    Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple
 *    of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score
 *    in B. To practice decomposition, write a separate helper method which finds the largest special
 *    score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text
 *    area.
 *
 *  Tests:
 *    scoresSpecial([12, 10, 4], [2, 20, 30]) ? 40
 *    scoresSpecial([20, 10, 4], [2, 20, 10]) ? 40
 *    scoresSpecial([12, 11, 4], [2, 20, 31]) ? 20
 *    scoresSpecial([1, 20, 2, 50], [3, 4, 5]) ? 50
 *    scoresSpecial([3, 4, 5], [1, 50, 2, 20]) ? 50
 *    scoresSpecial([10, 4, 20, 30], [20]) ? 50
 *    scoresSpecial([10, 4, 20, 30], [20]) ? 50
 *    scoresSpecial([10, 4, 20, 30], [3, 20, 99]) ? 50
 *    scoresSpecial([10, 4, 20, 30], [30, 20, 99]) ? 60
 *    scoresSpecial([], [2]) ? 0
 *    scoresSpecial([], [20]) ? 20
 *    scoresSpecial([14, 10, 4], [4, 20, 30]) ? 40
 *    other tests
 */
public class ScoresSpecial {
  public int scoresSpecial(int[] a, int[] b) {
    return largestSpecial(a) + largestSpecial(b);
  }

  public int largestSpecial(int[] scores) {
    int largest = 0;
    for (int score : scores) {
      if (isSpecial(score) && (score > largest)) {
        largest = score;
      }
    }
    return largest;
  }

  public boolean isSpecial(int score) {
    return (score % 10 == 0);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
