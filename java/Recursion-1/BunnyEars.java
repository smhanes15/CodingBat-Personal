/*
 *  Recursion-1 --> bunnyEars
 *
 *    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total
 *    number of ears across all the bunnies recursively (without loops or multiplication).
 *
 *  Tests:
 *    bunnyEars(0) ? 0
 *    bunnyEars(1) ? 2
 *    bunnyEars(2) ? 4
 *    bunnyEars(3) ? 6
 *    bunnyEars(4) ? 8
 *    bunnyEars(5) ? 10
 *    bunnyEars(12) ? 24
 *    bunnyEars(50) ? 100
 *    bunnyEars(234) ? 468
 *    other tests
 */
public class BunnyEars {
  public int bunnyEars(int bunnies) {
    if (bunnies == 0) return 0;
    if (bunnies == 1) return bunnies + 1;
    return 2 + bunnyEars(bunnies - 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
