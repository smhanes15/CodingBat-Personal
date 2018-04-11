/*
 *  Warmup-1 --> missingChar
 *
 *    Given a non-empty string and an int n, return a new string where the char at index n has been
 *    removed. The value of n will be a valid index of a char in the original string (i.e. n will be in
 *    the range 0..str.length()-1 inclusive).
 *
 *  Tests:
 *    missingChar("kitten", 1) ? "ktten"
 *    missingChar("kitten", 0) ? "itten"
 *    missingChar("kitten", 4) ? "kittn"
 *    missingChar("Hi", 0) ? "i"
 *    missingChar("Hi", 1) ? "H"
 *    missingChar("code", 0) ? "ode"
 *    missingChar("code", 1) ? "cde"
 *    missingChar("code", 2) ? "coe"
 *    missingChar("code", 3) ? "cod"
 *    missingChar("chocolate", 8) ? "chocolat"
 */
public class MissingChar {
  public String missingChar(String str, int n) {
    String first = str.substring(0, n);
    String second = str.substring(n + 1);
    return first + second;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
