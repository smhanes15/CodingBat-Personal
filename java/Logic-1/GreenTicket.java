/*
 *  Logic-1 --> greenTicket
 *
 *    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from
 *    each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the
 *    numbers are the same, the result is 10.
 *
 *  Tests:
 *    greenTicket(1, 2, 3) ? 0
 *    greenTicket(2, 2, 2) ? 20
 *    greenTicket(1, 1, 2) ? 10
 *    greenTicket(2, 1, 1) ? 10
 *    greenTicket(1, 2, 1) ? 10
 *    greenTicket(3, 2, 1) ? 0
 *    greenTicket(0, 0, 0) ? 20
 *    greenTicket(2, 0, 0) ? 10
 *    greenTicket(0, 9, 10) ? 0
 *    greenTicket(0, 10, 0) ? 10
 *    greenTicket(9, 9, 9) ? 20
 *    greenTicket(9, 0, 9) ? 10
 *    other tests
 */
public class GreenTicket {
  public int greenTicket(int a, int b, int c) {
    if (a != b && a != c && b != c) return 0;
    if (a == b && a == c) return 20;
    return 10;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
