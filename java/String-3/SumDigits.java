/*
 *  String-3 --> sumDigits
 *
 *    Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
 *    characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a
 *    char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 *
 *  Tests:
 *    sumDigits("aa1bc2d3") ? 6
 *    sumDigits("aa11b33") ? 8
 *    sumDigits("Chocolate") ? 0
 *    sumDigits("5hoco1a1e") ? 7
 *    sumDigits("123abc123") ? 12
 *    sumDigits("") ? 0
 *    sumDigits("Hello") ? 0
 *    sumDigits("X1z9b2") ? 12
 *    sumDigits("5432a") ? 14
 *    other tests
 */
public class SumDigits {
  public int sumDigits(String str) {
    int c = 0;
    for (int x = 0; x < str.length(); x++) {
      if (Character.isDigit(str.charAt(x))) c += Integer.parseInt(str.substring(x, x + 1));
    }
    return c;
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
