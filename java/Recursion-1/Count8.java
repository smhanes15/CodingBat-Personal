/*
 *  Recursion-1 --> count8
 *
 *    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a
 *    digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note
 *    that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
 *    rightmost digit (126 / 10 is 12).
 *
 *  Tests:
 *    count8(8) ? 1
 *    count8(818) ? 2
 *    count8(8818) ? 4
 *    count8(8088) ? 4
 *    count8(123) ? 0
 *    count8(81238) ? 2
 *    count8(88788) ? 6
 *    count8(8234) ? 1
 *    count8(2348) ? 1
 *    count8(23884) ? 3
 *    count8(0) ? 0
 *    count8(1818188) ? 5
 *    count8(8818181) ? 5
 *    count8(1080) ? 1
 *    count8(188) ? 3
 *    count8(88888) ? 9
 *    count8(9898) ? 2
 *    count8(78) ? 1
 *    other tests
 */
public class Count8 {
  public int count8(int n) {
    if (n == 0) return 0;
    return ((n % 10 == 8) ? (((n / 10) % 10 == 8) ? 2 : 1) : 0) + count8(n / 10);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
