/*
 *  Recursion-1 --> bunnyEars2
 *
 *    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2
 *    ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
 *    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or
 *    multiplication).
 *
 *  Tests:
 *    bunnyEars2(0) ? 0
 *    bunnyEars2(1) ? 2
 *    bunnyEars2(2) ? 5
 *    bunnyEars2(3) ? 7
 *    bunnyEars2(4) ? 10
 *    bunnyEars2(5) ? 12
 *    bunnyEars2(6) ? 15
 *    bunnyEars2(10) ? 25
 *    other tests
 */
public class BunnyEars2 {
  public int bunnyEars2(int bunnies) {
    int n = bunnies;
    if (n == 0) return 0;
    if (n % 2 == 0) return 3 + bunnyEars2(n - 1);
    return 2 + bunnyEars2(n - 1);
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
