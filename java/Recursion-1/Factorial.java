/*
 *  Recursion-1 --> factorial
 *
 *    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the
 *    result recursively (without loops).
 *
 *  Tests:
 *    factorial(1) ? 1
 *    factorial(2) ? 2
 *    factorial(3) ? 6
 *    factorial(4) ? 24
 *    factorial(5) ? 120
 *    factorial(6) ? 720
 *    factorial(7) ? 5040
 *    factorial(8) ? 40320
 *    factorial(12) ? 479001600
 *    other tests
 */
public class Factorial {
  public int factorial(int n) {
    if (n == 1) return n;
    return n * (factorial(n - 1));
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
